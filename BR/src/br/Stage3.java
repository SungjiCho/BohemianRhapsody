package br;

import java.util.ArrayList;
import java.util.Scanner;

public class Stage3 {
	Scanner stdIn = new Scanner(System.in);
	
	private Music BGM;
	private Music TRANS;
	private Text LOGO;
	public MainCharacter Freddie;
	private Window CONCERT;
	private Event STORY;
	public ArrayList<String> Gender;
	public String selectedGender;
	public String selectedKey;
	
	public Stage3(){
		this.BGM = new Music("event1.mp3", false);
		this.LOGO = new Text("sceneIntroLogo", 100);
		this.TRANS = new Music("sceneStart.mp3", false);		
		this.Freddie = new MainCharacter(new Stage2().getDepression());
		this.CONCERT = new Window();
		this.Gender = new ArrayList<String>();
		this.Gender.add("남자");
		this.Gender.add("여자");
	}
	
	
	/* 스테이지3에서 등장할 예비 팬의 성별 정하기 */
	public String getGender() {
		int idx = (int)(Math.random()*(GenderNum()));
		this.selectedGender = Gender.get(idx);
		return selectedGender;
	}
	
	
	/* 사용자의 주관적 세상 구성하기 */
	public void orientedGender(int orientation) {
		if(orientation == 1)
			this.Gender.add("남자");
		else
			this.Gender.add("여자");		
	}
	
	/*사용자의 주관적 세상 크기 구하기 */
	public int GenderNum() {	
		return Gender.size();
	}
	
	/* 사용자에게 정체성 방향 묻기 */
	public void askIdentity() {
		System.out.println("\n당신은 프레디 머큐리와 동일한 인생사건을 체험하였습니다.");
		System.out.println("당신은 프레디의 성적 지향성을 각성시킬 수 있는 기회가 있습니다.");
		System.out.println("어떤 방향을 선택하시겠습니까?  (1)동성  (2)이성");
		
		int orientation = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			orientation = stdIn.nextInt();
			input.interrupt();
		} while (orientation != 1 && orientation != 2);
		
		orientedGender(orientation);
	}
	
	
	/* 팬 만들기 시작 여부묻기 */
	public boolean battleOn() {
		int option = Freddie.tryOrNot();
		if(option == 1) 
			return true;
		else 
			return false;		
	}

	
	/* 팬 만들기 준비 */
	public void prepBattle() throws InterruptedException {
		Freddie.showWeapon();
		Freddie.listWeapon();
		this.selectedKey = Freddie.selectWeapon();
		Freddie.runWeapon(selectedKey);
		Freddie.useWeapon(selectedKey);
	}
	
	/* 팬 만들기 성공여부 판정하기 */
	public boolean batteWin() {
		int base = (int)(Math.random()*10) + 50;
		int bonus = Freddie.getCritical(selectedKey);		
		
		if(base*bonus >= 100)
			return true;
		else
			return false;		
	}
	
	/* 팬 만들기 */
	public void soundBattle() {
		if(battleOn()) {
			try {
				prepBattle();
				if(batteWin()) {
					System.out.println("\n축하합니다. 퀸의 팬이 추가되었습니다.");
					Freddie.addFan(getGender());
				}else {
					System.out.println("\n이런, 사운드 무기가 약합니다.");
					System.out.println("퀸의 팬 만들기에 실패합니다.");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}else {
			System.out.println("\n예비 팬이 사라집니다.");
		}
	}
	
	/* 세 번째 무대 실행하기 */
	public void start() throws InterruptedException {
		//제 1막
		TRANS.start(); LOGO.start();
		Thread.sleep(7*1000);

		BGM.start();
		STORY = new Event("FormBandMeetMary"); STORY.print(300);
		BGM.close();
		
		askIdentity();
		
		Thread fan1 = new Thread(new Fans(this), "사람 1호");
		fan1.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n자, 이제 본격적으로 제 1막 공연을 하러 가볼까요?");
		Thread.sleep(3600);
		CONCERT.Game(0);
		Thread.sleep(6000);
		
		askContinue();
		
		//제 2막
		TRANS = new Music("event2.mp3", false); 
		STORY = new Event("FormQueenGayPaul"); 
		TRANS.start(); STORY.print(300);
		
		askIdentity();
		
		Thread fan2 = new Thread(new Fans(this), "사람 2호");
		fan2.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n자, 이제 본격적으로 제 2막 공연을 하러 가볼까요?");
		CONCERT = new Window();
		Thread.sleep(3600);	
		CONCERT.Game(1);
		Thread.sleep(5000);
		
		askContinue();
		
		//제 3막
		TRANS = new Music("event3.mp3", false); 
		STORY = new Event("GetAidsLiveAid"); 
		TRANS.start(); STORY.print(300);
		
		askIdentity();
		
		Thread fan3 = new Thread(new Fans(this), "사람 3호");
		fan3.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n자, 이제 마지막 공연을 하러 가볼까요?");
		CONCERT = new Window();
		Thread.sleep(3600);	
		CONCERT.Game(2);
		Thread.sleep(5000);
		
		System.out.println("퀸 체험이 끝났습니다.");
		System.out.println("게임을 종료하시겠습니까? ");
		System.out.println("(0) 종료");
		
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			System.out.println();
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 0);
		
		System.exit(0);	
	}
	
	/* 장면전환 여부 묻기 */
	public void askContinue() {
		System.out.println("\n공연은 성황리에 마치셨나요? ");
		System.out.println("이제 다음 장면으로 이동하실까요? ");
		System.out.println("(1)이동  (2)종료");
		
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			System.out.println();
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		if(option == 2)
			System.exit(0);
	}
}
