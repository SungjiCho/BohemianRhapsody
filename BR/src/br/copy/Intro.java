package br.copy;

import java.util.Scanner;

public class Intro {
	
	private Music BGM;
	private Music TransTrack;
	private Text LOGO;
	
	public Intro() {
		
		/* 배경 음악과 로고 초기화 */
		this.BGM = new Music("introBGM.mp3", true);
		this.LOGO = new Text("text3", 200);
		
		try {
			BGM.start();
			LOGO.start();
			Thread.sleep(13*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n보헤미안 랩소디의 주인공, 프레디 머큐리의 삶의 오신 것을 환영합니다.");
		System.out.print("입장하시겠습니까?");
		System.out.println(" (1)입장  (2)종료");
		
		/* 사용자에게 시작여부 입력받기 */
		Scanner stdIn = new Scanner(System.in);
		int opt1 = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			opt1 = stdIn.nextInt();
			input.interrupt();
		} while (opt1 != 1 && opt1 != 2);

		if (opt1 == 2) {
			System.out.println("보헤미안 랩소디를 종료합니다.");
			System.exit(0);		
		}
		
		
		TransTrack = new Music("TransTrack1.mp3", false); //장면전환 트랙
		TransTrack.start();
		BGM.close();
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		/* 사용자의 사운드 반응 확인하기 */
		System.out.println("\n본격적인 체험에 앞서 실제 프레디 머큐리를 먼저 만나보겠습니다.");
		System.out.println("프레디 머큐리를 불러보세요! (힌트: 프레디)");
		TransTrack.close();

		String opt2 = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("부르기: ");
			opt2 = stdIn.next();
			input.interrupt();
		} while (!opt2.equals("프레디"));

		
		try {
			Window picture = new Window();
			picture.pop("Freddie");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n자~ 프레디 머큐리의 모습이 보이시나요?");
		System.out.println("이제 프레디를 따라해볼까요? (힌트: 에오)");
		
		
		String opt3;
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("1번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 에오)");
			System.out.print("함성: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("에오"));
		

		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("2번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 에어)");
			System.out.print("함성: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("에어"));
		
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("3번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 에레레로)");
			System.out.print("함성: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("에레레로"));
		
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("4번 입술을 클릭해서 소리를 듣고 함께 불러보세요! (힌트: 얼롸잇)");
			System.out.print("함성: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("얼롸잇"));
		
		System.out.println("\n프레디와 함께 즐거운 시간 보내셨나요?");
		System.out.println("앞으로 4가지의 소리는 퀸의 팬덤을 만드는데 사용됩니다.");
		System.out.println("1번부터 4번으로 숫자가 커질수록 매력도가 증가합니다.");
		
		System.out.println("\n당신은 프레디 머큐리의 시그니처 소리를 장전했습니다.");
		System.out.println("자, 이제 프레디 머큐리가 될 준비가 되셨나요? ");
		System.out.println("(1)시작  (2)종료 ");
		
		int opt4 = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			opt4 = stdIn.nextInt();
			input.interrupt();
		} while (opt4 != 1 && opt4 != 2);

		if (opt4 == 2) {
			System.out.println("보헤미안 랩소디를 종료합니다.");
			System.exit(0);		
		}

	}
}
