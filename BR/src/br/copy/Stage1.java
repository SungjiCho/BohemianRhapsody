package br.copy;

import java.util.Scanner;

public class Stage1 {

	private Music BGM;
	private Music TRACK;
	private Text LOGO;
	private Window FRAME;
	
	Scanner stdIn = new Scanner(System.in);
	
	/* ù ��° �������� �ʱ�ȭ */
	public Stage1() {
		this.BGM = new Music("introBGM.mp3", true);
		this.LOGO = new Text("text3", 200);
		this.TRACK = new Music("TransTrack1.mp3", false);
		this.FRAME = new Window();
	}
	
	/* ����ڿ��� ���ۿ��� �Է¹ޱ� */
	public void startOrClose() {
		int option = 0;
		do {
			Input input = new Input();
			input.start();
			System.out.print("\n�Է�: ");
			option = stdIn.nextInt();
			input.interrupt();
		} while (option != 1 && option != 2);
		
		if (option == 2) {
			System.out.println("����̾� ���ҵ� �����մϴ�.");
			System.exit(0);		
		}	
	}
	
	/* ������� ���� ���� Ȯ���ϱ� */
	public void echo(String hint) {
		String response = "";
		do {
			Input input = new Input();
			input.start();
			System.out.print("�θ���: ");
			response = stdIn.next();
			input.interrupt();
		} while (!response.equals(hint));
	}
	
	/* ù ��° ���� �����ϱ� */
	public void start() throws InterruptedException {
		BGM.start(); LOGO.start();
		Thread.sleep(13*1000);
		
		System.out.println("\n����̾� ���ҵ��� ���ΰ�, ������ ��ť���� ���� ���� ���� ȯ���մϴ�.");
		System.out.println("�����Ͻðڽ��ϱ�? (1)����  (2)����");
		startOrClose();
		
		TRACK.start(); BGM.close();
		Thread.sleep(1400);
		
		System.out.println("\n�������� ü�迡 �ռ� ���� ������ ��ť���� ���� �������ڽ��ϴ�.");
		System.out.println("������ ��ť���� �ҷ�������! (��Ʈ: ������)");
		echo("������");
		
		FRAME.pop("Freddie");
		Thread.sleep(1500);
		
		System.out.println("\n��~ ������ ��ť���� ����� ���̽ó���?");
		System.out.println("���� ������ �����غ����?");
		System.out.println("\n1�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������!");
		echo("����");	
		System.out.println("2�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: ����)");
		echo("����");	
		System.out.println("3�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: ��������)");
		echo("��������");	
		System.out.println("4�� �Լ��� Ŭ���ؼ� �Ҹ��� ��� �Բ� �ҷ�������! (��Ʈ: �����)");
		echo("�����");
		
		System.out.println("\n������� �Բ� ��ſ� �ð� �����̳���?");
		System.out.println("������ 4������ �Ҹ��� ���� �Ҵ��� ����µ� ���˴ϴ�.");
		System.out.println("1������ 4������ ���ڰ� Ŀ������ �ŷµ��� �����մϴ�.");
		
		System.out.println("\n����� ������ ��ť���� �ñ״�ó �Ҹ��� �����߽��ϴ�.");
		System.out.println("��, ���� ������ ��ť���� �� �غ� �Ǽ̳���? ");
		System.out.println("(1)����  (2)���� ");
		startOrClose();
	}
}
