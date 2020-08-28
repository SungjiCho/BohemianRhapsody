package br.copy;

import java.util.HashMap;
import java.util.Scanner;

public class DSMIVConsole {
	

	private DSMIVResponse Response;
	
	public DSMIVConsole(DSMIVResponse Response){
		this.Response = Response;
	}
	
	Scanner stdIn = new Scanner(System.in);
	
	//���� �Է� �ޱ�
	public void inputResponse(int q) {
		int mv = -99;		
		do {
			Input input = new Input();
			input.start();
			System.out.print("���� : ");
			mv = stdIn.nextInt();
			input.interrupt();			
		}while(0 > mv || mv > 4);	
		Response.addResponse(q, mv);
	}
	
	
	//��� ���� �ϱ�
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
