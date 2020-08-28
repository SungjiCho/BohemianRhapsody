package br.copy;

import java.util.Scanner;

import br.Music;
import br.Text;
import br.Window;

public class Stage3 {
	
	private Music BGM;
	private Music TRANS;
	private Text LOGO;
	
	private Window FRAME;
	private Story STORY;
	
	Scanner stdIn = new Scanner(System.in);
	
	public Stage3(){
		this.BGM = new Music("testBGM.mp3", true);
		this.LOGO = new Text("sceneIntroLogo", 100);
		this.TRANS = new Music("sceneStart.mp3", false);
	}
	
	public void start() throws InterruptedException {
		TRANS.start(); LOGO.start();
		Thread.sleep(3*1000);
		
		STORY = new Story("FormBandMeetMary");
		STORY.start(300);
		
	}
}
