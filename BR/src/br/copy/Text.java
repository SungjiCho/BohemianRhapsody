package br.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Text extends Thread{
	
	private File file;
	private FileReader fileReader;
	private BufferedReader bufReader;
	private int speed;
	
	//생성자
	public Text(String name, int speed) { //파일이름, 출력속도
		try {
			this.speed = speed;
			file = new File("C:\\eclipse\\aaaaaaaaa\\" + name + ".txt"); // 파일 객체 생성
			fileReader = new FileReader(file); // 입력 스트림 생성
			bufReader = new BufferedReader(fileReader); // 입력 버퍼 생성

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void close() throws IOException {
		bufReader.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				try {
					Thread.sleep(this.speed);
				} catch (InterruptedException e) {
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
