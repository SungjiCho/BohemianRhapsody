package br.copy;

public class Background {
	
	private Music BGM;
	private Music TransTrack;
	private Text LOGO;
	
	private DSMIVConsole test;
	private DSMIVResponse response;
	private MainCharacter Freddie;

	public Background() {
		
		//BGM Ʈ�� ��
		this.BGM = new Music("testBGM.mp3", true);
		BGM.start();

		//������ �����ϴ� ��
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/* ������� ��� ���� �����ϱ� */
		System.out.println("\n����� ���� ������ �� ���ʰ� �Խ��ϴ�.");
		System.out.println("����� ��� ������ �����ϰڽ��ϴ�.\n");
		
		this.response = new DSMIVResponse(-99);
		this.test = new DSMIVConsole(response);
		test.measureDSMIV();
		
		int level = response.levelDSMIV();
		this.Freddie = new MainCharacter(level);
		
		System.out.println("����� �����´� ����: " + response.totalDSMIV() + ", ����: " + response.levelDSMIV() + "�Դϴ�.");
		
		
		//���� �÷���
		Music sceneIntro = new Music("sceneIntro.mp3", false); //�����ȯ Ʈ��
		//��� ��ü�� �������� ���;ߵ�
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
//		long secDiffTime = (t2 - t1)/1000; //�� �ð��� �� ���
//		System.out.println("�ð�����(m) : "+secDiffTime);
//
//		System.out.println("1�� ����");
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
