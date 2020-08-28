package br.copy;

import java.util.Scanner;

public class Stage2 {
	
	private Music BGM;
	private Music TRACK;
	private Text LOGO;
	private DSMIVResponse response;
	
	Scanner stdIn = new Scanner(System.in);

	/* 첫 번째 스테이지 초기화 */
	public Stage2() {
		this.BGM = new Music("testBGM.mp3", true);
		this.LOGO = new Text("rain", 100);
		this.TRACK = new Music("TransTrack1.mp3", false);
		response = new DSMIVResponse(-99);
	}
	
	/* 사용자의 우울 상태 측정하기 */
	public void measureDepression() {
		DSMIV.introduceTest();
		DSMIVConsole test = new DSMIVConsole(response);
		test.measureDSMIV();
	}
	
	/* 주인공 우울에 사용자 값 넣기 */
	public void setDepression() {
		int level = response.levelDSMIV();
		new MainCharacter(level);
	}
	
	/* 첫 번째 무대 실행하기 */
	public void start() throws InterruptedException {
//		Event e = new Event("rain");
		
		BGM.start(); LOGO.start();
//		long start = System.currentTimeMillis(); //시작하는 시점 계산
//		e.print(100);/*LOGO.start();*/
//		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
//		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력
		Thread.sleep(4*1000);
		
		System.out.println("\n당신이 직접 프레디가 될 차례가 왔습니다.");
		System.out.println("당신의 우울 상태를 측정하겠습니다.");
		System.out.println("해당 점수에 따라 프레디로써 경험하는 세상이 달라집니다.");
	}

}
