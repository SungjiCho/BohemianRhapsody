package br.copy;

import java.util.HashMap;

public class DSMIVResponse {
	
	//주요 우울증 진단 기준(문항, 응답)	
	private HashMap<Integer, Integer> Response;
	private int total = 0;
	private int level = 0;
	
	//응답 객체 초기화
	public DSMIVResponse(int missingValue) {
		this.Response = new HashMap<Integer, Integer>();		
		for(int i = 1; i <= 21; i++)
			Response.put(i, missingValue);
	}
	
	//응답 값 추가하기
	public void addResponse(int q, int v) {
		Response.put(q, v);
	}
	
	
	//우울 총점수 구하기
	public int totalDSMIV() {
		for(int q : Response.keySet()) {
			total += Response.get(q);
		}
		return total;
	}
	
	//우울 수준 구하기
	public int levelDSMIV() {
		
		this.total = totalDSMIV();
		
		if(0 <= total && total <= 9) {
			this.level = 1;
		}else if(10 <= total && total <= 15) {
			this.level = 2;
		}else if(16 <= total && total <= 23) {
			this.level = 3;
		}else if(24 <= total && total <= 63) {
			this.level = 4;
		}else {
			this.level = 0;
		}
		
		return this.level;
	}
	
}
