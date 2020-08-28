package br.copy;

public class Track {

	private String windowImage;
	private String startImage;
	private String gameImage;
	private String startMusic;
	private String gameMusic;
	private String titleName;
	
	public String getWindowImage() {
		return windowImage;
	}
	public void setWindowImage(String windowImage) {
		this.windowImage= windowImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public Track(String windowImage, String startImage, String gameImage, String startMusic, String gameMusic, String titleName) {
		super();
		this.windowImage = windowImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
		this.titleName = titleName;
	}


}
