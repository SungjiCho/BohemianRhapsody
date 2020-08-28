package br;

public class Fans implements Runnable {
	
	private Stage3 S3; 
	private String gender;
	
	/* 쓰레드가 공유하는 객체 생성 */
	Fans(Stage3 S3){ 
		this.S3 = S3;
		this.gender = S3.getGender();
	}
	
	public void run() {
		String name = Thread.currentThread().getName();		
		
		System.out.println("\n예비 팬 "+ gender + name + "가 등장했습니다.");
		try{Thread.sleep(500);} catch(InterruptedException e) {}
	}
	
}
