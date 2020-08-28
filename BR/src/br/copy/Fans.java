package br.copy;

public class Fans implements Runnable {
	
	private MainCharacter Freddie;  // 여러 쓰레드가 공유하는 객체
	
	Fans(MainCharacter Freddie){ this.Freddie = Freddie; }
	
	public void run() {		
		//임의의 성별을 하나 선택해서 팬덤에 추가한다.
		int idx = (int)(Math.random()*Freddie.fansGenderNum(true));
		Freddie.attract(Freddie.fansGender.get(idx));
		
		try{Thread.sleep(500);} catch(InterruptedException e) {}
	}
}
