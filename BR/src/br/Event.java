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
			this.file = new File("C:\\eclipse\\aaaaaaaaa\\"+ name +".txt"); // ���� ��ü ����
			this.fileReader = new FileReader(file); // �Է� ��Ʈ�� ����
			this.bufReader = new BufferedReader(fileReader); // �Է� ���� ����
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
			bufReader.close(); // .readLine()�� ���� ���๮�ڸ� ���� ����		
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
