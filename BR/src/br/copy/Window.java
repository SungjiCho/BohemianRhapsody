package br.copy;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{	
	
	//전체화면 이미지를 담는 인스턴스
	private Image screenImage;
	private Graphics screenGraphic;

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
//	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
//	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
//	private Image noteRouteImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
//	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();
//	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png")).getImage();
	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private ImageIcon mouseEntered1 = new ImageIcon(Main.class.getResource("../images/mouseEntered1.png"));
	private ImageIcon mouseBasic1 = new ImageIcon(Main.class.getResource("../images/mouseBasic1.png"));
	private ImageIcon mouseEntered2 = new ImageIcon(Main.class.getResource("../images/mouseEntered2.png"));
	private ImageIcon mouseBasic2 = new ImageIcon(Main.class.getResource("../images/mouseBasic2.png"));
	private ImageIcon mouseEntered3 = new ImageIcon(Main.class.getResource("../images/mouseEntered3.png"));
	private ImageIcon mouseBasic3 = new ImageIcon(Main.class.getResource("../images/mouseBasic3.png"));
	private ImageIcon mouseEntered4 = new ImageIcon(Main.class.getResource("../images/mouseEntered4.png"));
	private ImageIcon mouseBasic4 = new ImageIcon(Main.class.getResource("../images/mouseBasic4.png"));
	private ImageIcon playButtonEntered = new ImageIcon(Main.class.getResource("../images/playButtonEntered.png"));
	private ImageIcon playButtonBasic = new ImageIcon(Main.class.getResource("../images/playButtonBasic.png"));
	private ImageIcon startButtonBasic = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon startButtonEntered = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon backButtonEntered = new ImageIcon(Main.class.getResource("../images/backButtonEntered.png"));
	private ImageIcon backButtonBasic = new ImageIcon(Main.class.getResource("../images/backButtonBasic.png"));
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton playButton = new JButton(playButtonBasic);
	private JButton startButton = new JButton(startButtonBasic);
	private JButton backButton = new JButton(backButtonBasic);
	private JButton mouseButton1 = new JButton(mouseBasic1);
	private JButton mouseButton2 = new JButton(mouseBasic2);
	private JButton mouseButton3 = new JButton(mouseBasic3);
	private JButton mouseButton4 = new JButton(mouseBasic4);
	
	private int mouseX, mouseY;
	
	private boolean isMainScreen = false;
	private boolean isGameScreen = false;
	
	ArrayList<Track> trackList = new ArrayList<Track>();
	
	private Image window;
	private Image selectedImage;
	private Music selectedMusic;
	private int nowSelected = 0;
	
	public static RhythmGame game;
	
	public void pop(String name) {
		setUndecorated(true);
		setTitle("Bohemian Rhapsody");
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		//이미지파일 가져와서 초기화
		window = new ImageIcon(Main.class.getResource("../images/" + name + ".png")).getImage();
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		add(exitButton);
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
		
		mouseButton1.setBounds(0, 360, 75, 33);
		mouseButton1.setBorderPainted(false);
		mouseButton1.setContentAreaFilled(false);
		mouseButton1.setFocusPainted(false);
		mouseButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseButton1.setIcon(mouseEntered1);
				mouseButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mouseButton1.setIcon(mouseBasic1);
				mouseButton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music ayoh = new Music("ayohCrowd.mp3", false);
				ayoh.start();
			}
		});
		add(mouseButton1);
		
		mouseButton2.setBounds(100, 360, 75, 33);
		mouseButton2.setBorderPainted(false);
		mouseButton2.setContentAreaFilled(false);
		mouseButton2.setFocusPainted(false);
		mouseButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseButton2.setIcon(mouseEntered2);
				mouseButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mouseButton2.setIcon(mouseBasic2);
				mouseButton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music ayuh = new Music("ayuhCrowd.mp3", false);
				ayuh.start();
			}
		});
		add(mouseButton2);
		
		mouseButton3.setBounds(200, 360, 75, 33);
		mouseButton3.setBorderPainted(false);
		mouseButton3.setContentAreaFilled(false);
		mouseButton3.setFocusPainted(false);
		mouseButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseButton3.setIcon(mouseEntered3);
				mouseButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mouseButton3.setIcon(mouseBasic3);
				mouseButton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music aylelelo = new Music("ayleleloCrowd.mp3", false);
				aylelelo.start();
			}
		});
		add(mouseButton3);
		
		mouseButton4.setBounds(300, 360, 75, 33);
		mouseButton4.setBorderPainted(false);
		mouseButton4.setContentAreaFilled(false);
		mouseButton4.setFocusPainted(false);
		mouseButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseButton4.setIcon(mouseEntered4);
				mouseButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mouseButton4.setIcon(mouseBasic4);
				mouseButton4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music alright = new Music("alrightCrowd.mp3", false);
				alright.start();
			}
		});
		add(mouseButton4);
	}
	
	
	
	
	public void Game(int nowSelected) {	
		trackList.add(new Track("LoveOfMyLife.png", "LoveOfMyLife Start.png", "LoveOfMyLife Game.png", 
				"Love of My Life Selected.mp3", "Queen - Love Of My Life.mp3", "Queen - Love Of My Life"));
		
		setUndecorated(true);
		setTitle("Bohemian Rhapsody");
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		addKeyListener(new KeyListener());	

		//이미지파일 가져와서 초기화
		window = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getWindowImage())).getImage();
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				if(selectedMusic != null)
					selectedMusic.close();
			}
		});
		add(exitButton);
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
		
		
		playButton.setBounds(310, 340, 280, 280);
		playButton.setBorderPainted(false);
		playButton.setContentAreaFilled(false);
		playButton.setFocusPainted(false);
		playButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				playButton.setIcon(playButtonEntered);
				playButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				playButton.setIcon(playButtonBasic);
				playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selectTrack(nowSelected);
				playButton.setVisible(false);
				startButton.setVisible(true);
				window = new ImageIcon(Main.class.getResource("../images/rainbow.png")).getImage();
				isMainScreen = true;
			}
		});
		add(playButton);
		
		startButton.setVisible(false);
		startButton.setBounds(370, 580, 980, 982);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEntered);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasic);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//시작 이벤트
				gameStart(nowSelected);
			}
		});
		add(startButton);
		
		backButton.setVisible(false);
		backButton.setBounds(20, 50, 30, 30);
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setIcon(backButtonEntered);
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setIcon(backButtonBasic);
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//메인 화면으로 돌아가는 이벤트
				backMain();		
			}
		});
		add(backButton);

		
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(1280, 720); //화면크기만큼 이미지 만들기 
		screenGraphic = screenImage.getGraphics(); //스크린이미지를 이용해서 그래픽객체 얻어오기
		screenDraw((Graphics2D)screenGraphic); //스크린그래픽에 이미지파일 그림그리기
		g.drawImage(screenImage, 0, 0, null); //스크린이미지를 게임 창 (0,0)위치에 그려주기
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(window, 0, 0, null); //window이미지를 스크린이미지에 그리기
		if(isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
		}
		if(isGameScreen) {
			game.screenDraw(g);
		}
		paintComponents(g);
		try {
			Thread.sleep(5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		this.repaint(); //지우고 다시 그리기
	}
	
	public void selectTrack(int nowSelected) {
		if(selectedMusic != null)
			selectedMusic.close();
		window = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getWindowImage())).getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage())).getImage();
		selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(), true);
		selectedMusic.start();
	}
	
	public void gameStart(int nowSelected) {
		if(selectedMusic != null)
			selectedMusic.close();
		isMainScreen = false;
		startButton.setVisible(false);
		window = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getGameImage())).getImage();
		backButton.setVisible(true);
		isGameScreen = true;		
		game = new RhythmGame(trackList.get(nowSelected).getTitleName(), 
				trackList.get(nowSelected).getGameMusic());
		game.start();
		setFocusable(true);
	}
	
	public void backMain() {
		selectTrack(nowSelected);
		startButton.setVisible(true);
		backButton.setVisible(false);
		isMainScreen = true;
		window = new ImageIcon(Main.class.getResource("../images/rainbow.png")).getImage();
		isGameScreen = false;
		game.close();
	}
	
//	public void enterMain() {
//		playButton.setVisible(false);
//		window = new ImageIcon(Main.class.getResource("../images/rainbow.png")).getImage();
//		isMainScreen = true;
//		startButton.setVisible(true);	
//		selectTrack(nowSelected);
//	}
}
