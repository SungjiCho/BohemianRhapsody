package br;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class MainCharacter {
	
	private int depression;	
	public ArrayList<String> fandom = new ArrayList<String>();
	public ArrayList<String> weapon = new ArrayList<String>(); //������� �����ؿ� ���� ���ι��� ������
	
	private HashMap<String, Music> Sound; //���� ����â��
	{
		Sound = new HashMap<String, Music>();	
		Sound.put("ayoh", new Music("ayohCrowd.mp3", false));
		Sound.put("ayuh", new Music("ayuhCrowd.mp3", false));
		Sound.put("aylelelo", new Music("ayleleloCrowd.mp3", false));
		Sound.put("alright", new Music("alrightCrowd.mp3", false));
	}
	private HashMap<String, Integer> Critical; //���� ���� ũ��Ƽ�� ����Ʈ
	{
		Critical = new HashMap<String, Integer>();	
		Critical.put("ayoh", 1);
		Critical.put("ayuh", 2);
		Critical.put("aylelelo", 3);
		Critical.put("alright", 4);
	}
	

	/* ������ */
	public MainCharacter(int level) {
		this.depression = level;
		
		//����� �����ؿ� ���� ���ΰ��� ���� ���� �ʱ�ȭ
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
	
	/*�� ���� ������ ũ��Ƽ�� ����Ʈ �����ֱ� */
	public void showWeapon() {
		System.out.println("\n���� ������ ũ��Ƽ�� ����Ʈ�Դϴ�.\n");
		for(String w : Critical.keySet()) {
			System.out.println(w + " ũ��Ƽ�� ����Ʈ : " + Critical.get(w));
		}
	}
	
	/*������� ���� ���� ���� ��Ȳ �����ֱ� */
	public void listWeapon() {
		System.out.println("\n����� ���� �����Դϴ�.");
		System.out.println(weapon.toString());
	}
	
	/* ����� ���� ���� �����ϱ� */
	public String selectWeapon() {
		String key = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			key = stdIn.next();
			input.interrupt();
		} while (!Sound.containsKey(key));
		
		return key;
	}
	
	/* ������ ���� ���� ����ϱ�(�Ҹ�����) */
	public void runWeapon(String key) throws InterruptedException {
		Sound.get(key).start();
		Thread.sleep(7*1000);
		Sound.get(key).close();
	}
	
	/* ���� ����� ��ġ�ϴ� ���⸦ ���� �������� �����ϱ� */
	public boolean useWeapon(String weaponName) {	
		for(int i = 0; i < weapon.size(); i++) {
			if(weaponName.equals(weapon.get(i))) {
				weapon.remove(i);
				return true;
			}			
		}
		return false;
	}
	
	/* ������ ���� ���� ũ��Ƽ�� ���� �������� */
	public int getCritical(String key) {
		int bonus = Critical.get(key);
		return bonus;
	}

	/* �� ����� ���� ���� */
	public int tryOrNot() {
		System.out.println("������ ����ðڽ��ϱ�? (1)����  (2)����");
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		return option;
	}
	
	/* �Ҵ��� �� �߰��ϱ� */
	public void addFan(String gender) {	
		fandom.add(gender);
//		System.out.println("�Ҵ� :" + fandom.toString());
	}
	
}
