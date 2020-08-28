package br;

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
	
	//������
	public Text(String name, int speed) { //�����̸�, ��¼ӵ�
		try {
			this.speed = speed;
			file = new File("C:\\eclipse\\aaaaaaaaa\\" + name + ".txt"); // ���� ��ü ����
			fileReader = new FileReader(file); // �Է� ��Ʈ�� ����
			bufReader = new BufferedReader(fileReader); // �Է� ���� ����
			
//			String line = "";
//			while ((line = bufReader.readLine()) != null) {
//				System.out.println(line);
//				try {
//					Thread.sleep(this.speed);
//				} catch (InterruptedException e) {
//				}
//			}
//			bufReader.close(); // .readLine()�� ���� ���๮�ڸ� ���� ����
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void close() throws IOException {
		bufReader.close();
		this.interrupt();
	}
	
	@Override
	public void run() { //������ ���
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
