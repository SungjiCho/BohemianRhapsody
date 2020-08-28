package br;

public class Main {
	
	public static final int NOTE_SPEED = 3;
	public static final int SLEEP_TIME = 10;
	public static final int REACH_TIME = 2;
	
	public static void main(String[] args) {
		
//		Window w = new Window();
//		w.Game(0);
		
		Stage1 S1 = new Stage1();
		Stage2 S2 = new Stage2();
		Stage3 S3 = new Stage3();
		
		try {
			S1.start();
			S2.start();
			S3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
