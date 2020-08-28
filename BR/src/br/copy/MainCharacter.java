package br.copy;

import java.util.ArrayList;
import java.util.HashMap;

public class MainCharacter {
	
	static private int depression;
	private boolean orientation;
	
	public ArrayList<String> fans = new ArrayList<>();
	public ArrayList<String> fansGender = new ArrayList<>();
	
	private HashMap<String, Integer> weapon;
	private HashMap<String, Music> Sound;
	{
		Sound = new HashMap<String, Music>();	
		Sound.put("ayoh", new Music("ayohCrowd.mp3", false));
		Sound.put("ayuh", new Music("ayuhCrowd.mp3", false));
		Sound.put("aylelelo", new Music("ayleleloCrowd.mp3", false));
		Sound.put("alright", new Music("alrightCrowd.mp3", false));
	}
	 
	
	
	//생성자
	public MainCharacter(int level) {
		this.depression = level;
		this.weapon = new HashMap<String, Integer>();
		
		//사용자 우울수준에 따라 사운드 무기 초기화
		if(depression == 1) {
			weapon.put("ayoh", 1);
			weapon.put("ayuh", 1);
			weapon.put("aylelelo", 1);
			weapon.put("alright", 1);
		}else if(depression == 2) {
			weapon.put("ayoh", 2);
			weapon.put("ayuh", 1);
			weapon.put("aylelelo", 1);
			weapon.put("alright", 1);
		}else if(depression == 3) {
			weapon.put("ayoh", 3);
			weapon.put("ayuh", 2);
			weapon.put("aylelelo", 1);
			weapon.put("alright", 1);
		}else if(depression == 4) {
			weapon.put("ayoh", 4);
			weapon.put("ayuh", 3);
			weapon.put("aylelelo", 2);
			weapon.put("alright", 1);
		}else {
			weapon.put("ayoh", 0);
			weapon.put("ayuh", 0);
			weapon.put("aylelelo", 0);
			weapon.put("alright", 0);
		}
		
		this.fansGender.add("male");
		this.fansGender.add("female");
	}
	
	
	public void attract(String name) {

		fans.add(name);
		System.out.println("FANS:" + fans.toString());
	}
	
	
	public int fansGenderNum(boolean orientation) {
		this.orientation = orientation;
		
		if(orientation) {
			return fansGender.size();
		}else {
			fansGender.add("male");
			return fansGender.size();
		}
	}

}
