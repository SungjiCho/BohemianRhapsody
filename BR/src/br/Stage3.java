package br;

import java.util.ArrayList;
import java.util.Scanner;

public class Stage3 {
	Scanner stdIn = new Scanner(System.in);
	
	private Music BGM;
	private Music TRANS;
	private Text LOGO;
	public MainCharacter Freddie;
	private Window CONCERT;
	private Event STORY;
	public ArrayList<String> Gender;
	public String selectedGender;
	public String selectedKey;
	
	public Stage3(){
		this.BGM = new Music("event1.mp3", false);
		this.LOGO = new Text("sceneIntroLogo", 100);
		this.TRANS = new Music("sceneStart.mp3", false);		
		this.Freddie = new MainCharacter(new Stage2().getDepression());
		this.CONCERT = new Window();
		this.Gender = new ArrayList<String>();
		this.Gender.add("����");
		this.Gender.add("����");
	}
	
	
	/* ��������3���� ������ ���� ���� ���� ���ϱ� */
	public String getGender() {
		int idx = (int)(Math.random()*(GenderNum()));
		this.selectedGender = Gender.get(idx);
		return selectedGender;
	}
	
	
	/* ������� �ְ��� ���� �����ϱ� */
	public void orientedGender(int orientation) {
		if(orientation == 1)
			this.Gender.add("����");
		else
			this.Gender.add("����");		
	}
	
	/*������� �ְ��� ���� ũ�� ���ϱ� */
	public int GenderNum() {	
		return Gender.size();
	}
	
	/* ����ڿ��� ��ü�� ���� ���� */
	public void askIdentity() {
		System.out.println("\n����� ������ ��ť���� ������ �λ������ ü���Ͽ����ϴ�.");
		System.out.println("����� �������� ���� ���⼺�� ������ų �� �ִ� ��ȸ�� �ֽ��ϴ�.");
		System.out.println("� ������ �����Ͻðڽ��ϱ�?  (1)����  (2)�̼�");
		
		int orientation = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			orientation = stdIn.nextInt();
			input.interrupt();
		} while (orientation != 1 && orientation != 2);
		
		orientedGender(orientation);
	}
	
	
	/* �� ����� ���� ���ι��� */
	public boolean battleOn() {
		int option = Freddie.tryOrNot();
		if(option == 1) 
			return true;
		else 
			return false;		
	}

	
	/* �� ����� �غ� */
	public void prepBattle() throws InterruptedException {
		Freddie.showWeapon();
		Freddie.listWeapon();
		this.selectedKey = Freddie.selectWeapon();
		Freddie.runWeapon(selectedKey);
		Freddie.useWeapon(selectedKey);
	}
	
	/* �� ����� �������� �����ϱ� */
	public boolean batteWin() {
		int base = (int)(Math.random()*10) + 50;
		int bonus = Freddie.getCritical(selectedKey);		
		
		if(base*bonus >= 100)
			return true;
		else
			return false;		
	}
	
	/* �� ����� */
	public void soundBattle() {
		if(battleOn()) {
			try {
				prepBattle();
				if(batteWin()) {
					System.out.println("\n�����մϴ�. ���� ���� �߰��Ǿ����ϴ�.");
					Freddie.addFan(getGender());
				}else {
					System.out.println("\n�̷�, ���� ���Ⱑ ���մϴ�.");
					System.out.println("���� �� ����⿡ �����մϴ�.");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}else {
			System.out.println("\n���� ���� ������ϴ�.");
		}
	}
	
	/* �� ��° ���� �����ϱ� */
	public void start() throws InterruptedException {
		//�� 1��
		TRANS.start(); LOGO.start();
		Thread.sleep(7*1000);

		BGM.start();
		STORY = new Event("FormBandMeetMary"); STORY.print(300);
		BGM.close();
		
		askIdentity();
		
		Thread fan1 = new Thread(new Fans(this), "��� 1ȣ");
		fan1.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n��, ���� ���������� �� 1�� ������ �Ϸ� �������?");
		Thread.sleep(3600);
		CONCERT.Game(0);
		Thread.sleep(6000);
		
		askContinue();
		
		//�� 2��
		TRANS = new Music("event2.mp3", false); 
		STORY = new Event("FormQueenGayPaul"); 
		TRANS.start(); STORY.print(300);
		
		askIdentity();
		
		Thread fan2 = new Thread(new Fans(this), "��� 2ȣ");
		fan2.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n��, ���� ���������� �� 2�� ������ �Ϸ� �������?");
		CONCERT = new Window();
		Thread.sleep(3600);	
		CONCERT.Game(1);
		Thread.sleep(5000);
		
		askContinue();
		
		//�� 3��
		TRANS = new Music("event3.mp3", false); 
		STORY = new Event("GetAidsLiveAid"); 
		TRANS.start(); STORY.print(300);
		
		askIdentity();
		
		Thread fan3 = new Thread(new Fans(this), "��� 3ȣ");
		fan3.start();
		System.out.println();
		Thread.sleep(1000);
		
		soundBattle();
		Thread.sleep(1000);
		
		System.out.println("\n��, ���� ������ ������ �Ϸ� �������?");
		CONCERT = new Window();
		Thread.sleep(3600);	
		CONCERT.Game(2);
		Thread.sleep(5000);
		
		System.out.println("�� ü���� �������ϴ�.");
		System.out.println("������ �����Ͻðڽ��ϱ�? ");
		System.out.println("(0) ����");
		
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			System.out.println();
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 0);
		
		System.exit(0);	
	}
	
	/* �����ȯ ���� ���� */
	public void askContinue() {
		System.out.println("\n������ ��Ȳ���� ��ġ�̳���? ");
		System.out.println("���� ���� ������� �̵��ϽǱ��? ");
		System.out.println("(1)�̵�  (2)����");
		
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			System.out.println();
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		if(option == 2)
			System.exit(0);
	}
}
