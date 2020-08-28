package br;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop; //���ѹݺ� ����
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	private int time;
	
	//������
	public Music(String name, boolean isLoop) { //������, ���ѹݺ�����
		try { //����ó��
			this.isLoop = isLoop; //�ʱ�ȭ
			file = new File(Main.class.getResource("../music/" + name).toURI()); //*.mp3���� ��������
			fis = new FileInputStream(file); //�ش�����
			bis = new BufferedInputStream(fis); //���ۿ� ���
			player = new Player(bis); 
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { //���� �����ϱ�
		isLoop = false; 
		player.close();
		this.interrupt(); //������ �������� �����
	}
	
	@Override
	public void run() { //������ ���
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while(isLoop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
