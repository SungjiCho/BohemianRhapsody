package br.copy;

import java.util.Scanner;

public class Stage2 {
	
	private Music BGM;
	private Music TRACK;
	private Text LOGO;
	private DSMIVResponse response;
	
	Scanner stdIn = new Scanner(System.in);

	/* ù ��° �������� �ʱ�ȭ */
	public Stage2() {
		this.BGM = new Music("testBGM.mp3", true);
		this.LOGO = new Text("rain", 100);
		this.TRACK = new Music("TransTrack1.mp3", false);
		response = new DSMIVResponse(-99);
	}
	
	/* ������� ��� ���� �����ϱ� */
	public void measureDepression() {
		DSMIV.introduceTest();
		DSMIVConsole test = new DSMIVConsole(response);
		test.measureDSMIV();
	}
	
	/* ���ΰ� ��￡ ����� �� �ֱ� */
	public void setDepression() {
		int level = response.levelDSMIV();
		new MainCharacter(level);
	}
	
	/* ù ��° ���� �����ϱ� */
	public void start() throws InterruptedException {
//		Event e = new Event("rain");
		
		BGM.start(); LOGO.start();
//		long start = System.currentTimeMillis(); //�����ϴ� ���� ���
//		e.print(100);/*LOGO.start();*/
//		long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
//		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� �ð� ��� �� ���
		Thread.sleep(4*1000);
		
		System.out.println("\n����� ���� ������ �� ���ʰ� �Խ��ϴ�.");
		System.out.println("����� ��� ���¸� �����ϰڽ��ϴ�.");
		System.out.println("�ش� ������ ���� ������ν� �����ϴ� ������ �޶����ϴ�.");
	}

}
