package br;

import java.util.Scanner;

public class Stage2 {
	
	private Music BGM;
	private Music TRANS;
	private Text LOGO;
	
	private DSMIVResponse response;
	public MainCharacter Freddie;
	
	Scanner stdIn = new Scanner(System.in);

	/* ù ��° �������� �ʱ�ȭ */
	public Stage2() {
		this.BGM = new Music("testBGM.mp3", true);
		this.LOGO = new Text("rain", 100);
		this.TRANS = new Music("TransTrack1.mp3", false);
		response = new DSMIVResponse(-99);
	}
	
	/* ����ڿ��� ���ۿ��� �Է¹ޱ� */
	public void startOrClose() {
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		if (option == 2) {
			System.out.println("����̾� ���ҵ� �����մϴ�.");
			System.exit(0);		
		}	
	}
	
	/* ������� ��� ���� �����ϱ� */
	public void measureDepression() {
		DSMIV.introduceTest();
		DSMIVConsole test = new DSMIVConsole(response);
		test.measureDSMIV();
	}
	
	/* ����� ������ �������� */
	public int getDepression() {
		int level = response.levelDSMIV();
		return level;
	}
	
	/* �ʱ�ȭ�� ���ΰ� ĳ���� �������� */
	public MainCharacter getFreddie() {
		return this.Freddie;
	}
	
	/* �� ��° ���� �����ϱ� */
	public void start() throws InterruptedException {
		BGM.start(); LOGO.start();
		Thread.sleep(6*1000);
		
		System.out.println("\n����� ���� ������ �� ���ʰ� �Խ��ϴ�.");
		System.out.println("����� ��� ���¸� �����ϰڽ��ϴ�.");
		System.out.println("�ش� ������ ���� ������ν� �����ϴ� ������ �޶����ϴ�.");	
		Thread.sleep(1000);
		
		measureDepression();
		Freddie = new MainCharacter(getDepression());		
		Thread.sleep(300);
		
		TRANS.start(); BGM.close();
		Thread.sleep(1000);

		System.out.println("\n������ ��� �����̽��ϴ�.");
		System.out.println("\n������ ���� �Ҵ��� ����� ���� ��� ������ ����� �Ҹ������� ������ �����ϴ�.");
		Freddie.showWeapon();
		Thread.sleep(300);
		
		System.out.println("\n��, ���� ������ ��ť���� ���� �����Ͻðڽ��ϱ�? ");
		System.out.println("(1)����  (2)���� ");
		startOrClose();
	}
}
