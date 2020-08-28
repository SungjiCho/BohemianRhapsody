package br.copy;

import java.util.Scanner;

public class Intro {
	
	private Music BGM;
	private Music TransTrack;
	private Text LOGO;
	
	public Intro() {
		
		/* ��� ���ǰ� �ΰ� �ʱ�ȭ */
		this.BGM = new Music("introBGM.mp3", true);
		this.LOGO = new Text("text3", 200);
		
		try {
			BGM.start();
			LOGO.start();
			Thread.sleep(13*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n����̾� ���ҵ��� ���ΰ�, ������ ��ť���� ���� ���� ���� ȯ���մϴ�.");
		System.out.print("�����Ͻðڽ��ϱ�?");
		System.out.println(" (1)����  (2)����");
		
		/* ����ڿ��� ���ۿ��� �Է¹ޱ� */
		Scanner stdIn = new Scanner(System.in);
		int opt1 = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			opt1 = stdIn.nextInt();
			input.interrupt();
		} while (opt1 != 1 && opt1 != 2);

		if (opt1 == 2) {
			System.out.println("����̾� ���ҵ� �����մϴ�.");
			System.exit(0);		
		}
		
		
		TransTrack = new Music("TransTrack1.mp3", false); //�����ȯ Ʈ��
		TransTrack.start();
		BGM.close();
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		/* ������� ���� ���� Ȯ���ϱ� */
		System.out.println("\n�������� ü�迡 �ռ� ���� ������ ��ť���� ���� �������ڽ��ϴ�.");
		System.out.println("������ ��ť���� �ҷ�������! (��Ʈ: ������)");
		TransTrack.close();

		String opt2 = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("�θ���: ");
			opt2 = stdIn.next();
			input.interrupt();
		} while (!opt2.equals("������"));

		
		try {
			Window picture = new Window();
			picture.pop("Freddie");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n��~ ������ ��ť���� ����� ���̽ó���?");
		System.out.println("���� ������ �����غ����? (��Ʈ: ����)");
		
		
		String opt3;
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("1�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: ����)");
			System.out.print("�Լ�: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("����"));
		

		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("2�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: ����)");
			System.out.print("�Լ�: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("����"));
		
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("3�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: ��������)");
			System.out.print("�Լ�: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("��������"));
		
		do {
			opt3 = "";
			Input input = new Input();
			input.start();
			System.out.println("4�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: �����)");
			System.out.print("�Լ�: ");
			opt3 = stdIn.next();
			input.interrupt();
		} while (!opt3.equals("�����"));
		
		System.out.println("\n������� �Բ� ��ſ� �ð� �����̳���?");
		System.out.println("������ 4������ �Ҹ��� ���� �Ҵ��� ����µ� ���˴ϴ�.");
		System.out.println("1������ 4������ ���ڰ� Ŀ������ �ŷµ��� �����մϴ�.");
		
		System.out.println("\n����� ������ ��ť���� �ñ״�ó �Ҹ��� �����߽��ϴ�.");
		System.out.println("��, ���� ������ ��ť���� �� �غ� �Ǽ̳���? ");
		System.out.println("(1)����  (2)���� ");
		
		int opt4 = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			opt4 = stdIn.nextInt();
			input.interrupt();
		} while (opt4 != 1 && opt4 != 2);

		if (opt4 == 2) {
			System.out.println("����̾� ���ҵ� �����մϴ�.");
			System.exit(0);		
		}

	}
}
