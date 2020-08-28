package br;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Event {

	private File file;
	private FileReader fileReader;
	private BufferedReader bufReader;
	
	public Event(String name) {
		try {
			this.file = new File("C:\\eclipse\\aaaaaaaaa\\"+ name +".txt"); // 파일 객체 생성
			this.fileReader = new FileReader(file); // 입력 스트림 생성
			this.bufReader = new BufferedReader(fileReader); // 입력 버퍼 생성
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void print(int speed) {
		try {
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
				}
			}
			bufReader.close(); // .readLine()은 끝에 개행문자를 읽지 않음		
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
