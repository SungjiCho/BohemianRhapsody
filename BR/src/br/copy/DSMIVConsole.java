package br.copy;

import java.util.HashMap;
import java.util.Scanner;

public class DSMIVConsole {
	

	private DSMIVResponse Response;
	
	public DSMIVConsole(DSMIVResponse Response){
		this.Response = Response;
	}
	
	Scanner stdIn = new Scanner(System.in);
	
	//응답 입력 받기
	public void inputResponse(int q) {
		int mv = -99;		
		do {
			Input input = new Input();
			input.start();
			System.out.print("응답 : ");
			mv = stdIn.nextInt();
			input.interrupt();			
		}while(0 > mv || mv > 4);	
		Response.addResponse(q, mv);
	}
	
	
	//우울 측정 하기
	public void measureDSMIV() {
		for(int q : DSMIV.getQuestion().keySet()) {
			HashMap<Integer, String> likert = DSMIV.getQuestion().get(q);
			System.out.println();
			for(int score : likert.keySet()) {
				String inquiry = likert.get(score);
				System.out.println("("+score+") "+ inquiry);
			}
			System.out.println();
			inputResponse(q);
		}		
	}
	
}
