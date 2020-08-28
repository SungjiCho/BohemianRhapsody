package br;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class MainCharacter {
	
	private int depression;	
	public ArrayList<String> fandom = new ArrayList<String>();
	public ArrayList<String> weapon = new ArrayList<String>(); //사용자의 우울수준에 따른 개인무기 보유고
	
	private HashMap<String, Music> Sound; //사운드 무기창고
	{
		Sound = new HashMap<String, Music>();	
		Sound.put("ayoh", new Music("ayohCrowd.mp3", false));
		Sound.put("ayuh", new Music("ayuhCrowd.mp3", false));
		Sound.put("aylelelo", new Music("ayleleloCrowd.mp3", false));
		Sound.put("alright", new Music("alrightCrowd.mp3", false));
	}
	private HashMap<String, Integer> Critical; //사운드 무기 크리티컬 포인트
	{
		Critical = new HashMap<String, Integer>();	
		Critical.put("ayoh", 1);
		Critical.put("ayuh", 2);
		Critical.put("aylelelo", 3);
		Critical.put("alright", 4);
	}
	

	/* 생성자 */
	public MainCharacter(int level) {
		this.depression = level;
		
		//사용자 우울수준에 따른 주인공의 무기 갯수 초기화
		if(depression == 1) {
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("aylelelo");	
			weapon.add("alright");			
		}else if(depression == 2) {
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("aylelelo");
			weapon.add("aylelelo");
			weapon.add("alright");
		}else if(depression == 3) {
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("aylelelo");
			weapon.add("aylelelo");
			weapon.add("alright");
		}else if(depression == 4) {
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayoh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("aylelelo");
			weapon.add("aylelelo");
			weapon.add("alright");
			weapon.add("alright");
			weapon.add("alright");
		}else {
			weapon.add("ayoh");
			weapon.add("ayuh");
			weapon.add("ayuh");
			weapon.add("aylelelo");	
			weapon.add("alright");
		}
	}
	
	
	Scanner stdIn = new Scanner(System.in);
	
	/*각 사운드 무기의 크리티컬 포인트 보여주기 */
	public void showWeapon() {
		System.out.println("\n사운드 무기의 크리티컬 포인트입니다.\n");
		for(String w : Critical.keySet()) {
			System.out.println(w + " 크리티컬 포인트 : " + Critical.get(w));
		}
	}
	
	/*사용자의 현재 무기 보유 상황 보여주기 */
	public void listWeapon() {
		System.out.println("\n당신의 사운드 무기입니다.");
		System.out.println(weapon.toString());
	}
	
	/* 사용자 사운드 무기 선택하기 */
	public String selectWeapon() {
		String key = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			key = stdIn.next();
			input.interrupt();
		} while (!Sound.containsKey(key));
		
		return key;
	}
	
	/* 선택한 사운드 무기 사용하기(소리내기) */
	public void runWeapon(String key) throws InterruptedException {
		Sound.get(key).start();
		Thread.sleep(7*1000);
		Sound.get(key).close();
	}
	
	/* 사용된 사운드와 일치하는 무기를 개인 보유고에서 제거하기 */
	public boolean useWeapon(String weaponName) {	
		for(int i = 0; i < weapon.size(); i++) {
			if(weaponName.equals(weapon.get(i))) {
				weapon.remove(i);
				return true;
			}			
		}
		return false;
	}
	
	/* 선택한 사운드 무기 크리티컬 점수 가져오기 */
	public int getCritical(String key) {
		int bonus = Critical.get(key);
		return bonus;
	}

	/* 팬 만들기 여부 묻기 */
	public int tryOrNot() {
		System.out.println("팬으로 만드시겠습니까? (1)도전  (2)포기");
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n입력: ");
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		return option;
	}
	
	/* 팬덤에 팬 추가하기 */
	public void addFan(String gender) {	
		fandom.add(gender);
//		System.out.println("팬덤 :" + fandom.toString());
	}
	
}
