package br.copy;

public class Fans implements Runnable {
	
	private MainCharacter Freddie;  // ���� �����尡 �����ϴ� ��ü
	
	Fans(MainCharacter Freddie){ this.Freddie = Freddie; }
	
	public void run() {		
		//������ ������ �ϳ� �����ؼ� �Ҵ��� �߰��Ѵ�.
		int idx = (int)(Math.random()*Freddie.fansGenderNum(true));
		Freddie.attract(Freddie.fansGender.get(idx));
		
		try{Thread.sleep(500);} catch(InterruptedException e) {}
	}
}
