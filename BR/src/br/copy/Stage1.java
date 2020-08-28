package br.copy;

import java.util.Scanner;

public class Stage1 {

	private Music BGM;
	private Music TRACK;
	private Text LOGO;
	private Window FRAME;
	
	Scanner stdIn = new Scanner(System.in);
	
	/* 첫 번째 스테이지 초기화 */
	public Stage1() {
		this.BGM = new Music("introBGM.mp3", true);
		this.LOGO = new Text("text3", 200);
		this.TRACK = new Music("TransTrack1.mp3", false);
		this.FRAME = new Window();
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
	
	/* 사용자의 사운드 반응 확인하기 */
	public void echo(String hint) {
		String response = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("부르기: ");
			response = stdIn.next();
			input.interrupt();
		} while (!response.equals(hint));
	}
	
	/* 첫 번째 무대 실행하기 */
	public void start() throws InterruptedException {
		BGM.start(); LOGO.start();
		Thread.sleep(13*1000);
		
		System.out.println("\n보헤미안 랩소디의 주인공, 프레디 머큐리의 삶의 오신 것을 환영합니다.");
		System.out.println("입장하시겠습니까? (1)입장  (2)종료");
		startOrClose();
		
		TRACK.start(); BGM.close();
		Thread.sleep(1400);
		
		System.out.println("\n본격적인 체험에 앞서 실제 프레디 머큐리를 먼저 만나보겠습니다.");
		System.out.println("프레디 머큐리를 불러보세요! (힌트: 프레디)");
		echo("프레디");
		
		FRAME.pop("Freddie");
		Thread.sleep(1500);
		
		System.out.println("\n자~ 프레디 머큐리의 모습이 보이시나요?");
		System.out.println("이제 프레디를 따라해볼까요?");
		System.out.println("\n1번 입술을 클릭해서 소리를 듣고 함께 불러보세요!");
		echo("에오");	
		System.out.println("2번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 에어)");
		echo("에어");	
		System.out.println("3번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 에레레로)");
		echo("에레레로");	
		System.out.println("4번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 얼롸잇)");
		echo("얼롸잇");
		
		System.out.println("\n프레디와 함께 즐거운 시간 보내셨나요?");
		System.out.println("앞으로 4가지의 소리는 퀸의 팬덤을 만드는데 사용됩니다.");
		System.out.println("1번부터 4번으로 숫자가 커질수록 매력도가 증가합니다.");
		
		System.out.println("\n당신은 프레디 머큐리의 시그니처 소리를 장전했습니다.");
		System.out.println("자, 이제 프레디 머큐리가 될 준비가 되셨나요? ");
		System.out.println("(1)시작  (2)종료 ");
		startOrClose();
	}
}
