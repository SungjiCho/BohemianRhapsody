package br;

public class Fans implements Runnable {
	
	private Stage3 S3; 
	private String gender;
	
	/* �����尡 �����ϴ� ��ü ���� */
	Fans(Stage3 S3){ 
		this.S3 = S3;
		this.gender = S3.getGender();
	}
	
	public void run() {
		String name = Thread.currentThread().getName();		
		
		System.out.println("\n���� �� "+ gender + name + "�� �����߽��ϴ�.");
		try{Thread.sleep(500);} catch(InterruptedException e) {}
	}
	
}
