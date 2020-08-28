package br;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop; //무한반복 설정
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	private int time;
	
	//생성자
	public Music(String name, boolean isLoop) { //곡제목, 무한반복여부
		try { //예외처리
			this.isLoop = isLoop; //초기화
			file = new File(Main.class.getResource("../music/" + name).toURI()); //*.mp3파일 가져오기
			fis = new FileInputStream(file); //해당파일
			bis = new BufferedInputStream(fis); //버퍼에 담기
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
	
	public void close() { //음악 종료하기
		isLoop = false; 
		player.close();
		this.interrupt(); //쓰레드 중지상태 만들기
	}
	
	@Override
	public void run() { //쓰레드 상속
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
