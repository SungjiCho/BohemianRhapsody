package br;

import java.util.Scanner;

public class Stage2 {
	
	private Music BGM;
	private Music TRANS;
	private Text LOGO;
	
	private DSMIVResponse response;
	public MainCharacter Freddie;
	
	Scanner stdIn = new Scanner(System.in);

	/* 첫 번째 스테이지 초기화 */
	public Stage2() {
		this.BGM = new Music("testBGM.mp3", true);
		this.LOGO = new Text("rain", 100);
		this.TRANS = new Music("TransTrack1.mp3", false);
		response = new DSMIVResponse(-99);
	}
	
	/* 사용자에게 시작여부 입력받기 */
	public void startOrClose() {
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		if (option == 2) {
			System.out.println("보헤미안 랩소디를 종료합니다.");
			System.exit(0);		
		}	
	}
	
	/* 사용자의 우울 상태 측정하기 */
	public void measureDepression() {
		DSMIV.introduceTest();
		DSMIVConsole test = new DSMIVConsole(response);
		test.measureDSMIV();
	}
	
	/* 사용자 측정값 가져오기 */
	public int getDepression() {
		int level = response.levelDSMIV();
		return level;
	}
	
	/* 초기화된 주인공 캐릭터 가져가기 */
	public MainCharacter getFreddie() {
		return this.Freddie;
	}
	
	/* 두 번째 무대 실행하기 */
	public void start() throws InterruptedException {
		BGM.start(); LOGO.start();
		Thread.sleep(6*1000);
		
		System.out.println("\n당신이 직접 프레디가 될 차례가 왔습니다.");
		System.out.println("당신의 우울 상태를 측정하겠습니다.");
		System.out.println("해당 점수에 따라 프레디로써 경험하는 세상이 달라집니다.");	
		Thread.sleep(1000);
		
		measureDepression();
		Freddie = new MainCharacter(getDepression());		
		Thread.sleep(300);
		
		TRANS.start(); BGM.close();
		Thread.sleep(1000);

		System.out.println("\n측정이 모두 끝나셨습니다.");
		System.out.println("\n앞으로 퀸의 팬덤을 만들기 위해 사용 가능한 당신의 소리점수는 다음과 같습니다.");
		Freddie.showWeapon();
		Thread.sleep(300);
		
		System.out.println("\n자, 이제 프레디 머큐리의 삶을 시작하시겠습니까? ");
		System.out.println("(1)시작  (2)종료 ");
		startOrClose();
	}
}
