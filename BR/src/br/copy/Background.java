package br.copy;

public class Background {
	
	private Music BGM;
	private Music TransTrack;
	private Text LOGO;
	
	private DSMIVConsole test;
	private DSMIVResponse response;
	private MainCharacter Freddie;

	public Background() {
		
		//BGM 트는 애
		this.BGM = new Music("testBGM.mp3", true);
		BGM.start();

		//쓰레드 관리하는 애
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/* 사용자의 우울 상태 측정하기 */
		System.out.println("\n당신이 직접 프레디가 될 차례가 왔습니다.");
		System.out.println("당신의 우울 점수를 측정하겠습니다.\n");
		
		this.response = new DSMIVResponse(-99);
		this.test = new DSMIVConsole(response);
		test.measureDSMIV();
		
		int level = response.levelDSMIV();
		this.Freddie = new MainCharacter(level);
		
		System.out.println("당신의 우울상태는 총점: " + response.totalDSMIV() + ", 레벨: " + response.levelDSMIV() + "입니다.");
		
		
		//사운드 플레이
		Music sceneIntro = new Music("sceneIntro.mp3", false); //장면전환 트랙
		//사건 객체가 여러개가 나와야됨
		Event e = new Event("sceneIntroLogo");
		
		
//		this.LOGO = new Text("sceneIntroLogo", 150);
//		long t1 = System.currentTimeMillis();
//		sceneIntro.start();
//		e.print(150);
//		LOGO.start();

//		BGM.close();
		
//		try {
//			Thread.sleep(1400);
//			sceneIntro.close();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		long t2 = System.currentTimeMillis();
//		long secDiffTime = (t2 - t1)/1000; //두 시간에 차 계산
//		System.out.println("시간차이(m) : "+secDiffTime);
//
//		System.out.println("1막 시작");
//		EventQueue eq = new EventQueue();
//		Event e1 = new Event("formBand");
//		e1.print(200);
		
		Window Track1 = new Window();
		Track1.Game(0);
		
		
	}
	
	public void sound(String track) {
		Music music = new Music(track+".mp3", false);
	}

	
}
