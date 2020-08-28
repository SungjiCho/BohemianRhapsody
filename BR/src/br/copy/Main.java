package br.copy;

public class Main {
	
	public static final int NOTE_SPEED = 3;
	public static final int SLEEP_TIME = 10;
	public static final int REACH_TIME = 2;
	
	public static void main(String[] args) {
		
//		Stage2 s2 = new Stage2();
//		try {
//			s2.start();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//		new Intro();
//		new Background();
//		
//		Window Track1 = new Window();
//		Track1.Game(0);
		
		Stage1 s1 = new Stage1();
		try {
			s1.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
	}
}
