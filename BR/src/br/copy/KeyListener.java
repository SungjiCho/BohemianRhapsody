package br.copy;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(Window.game == null) return;
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Window.game.pressS();		
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			Window.game.pressD();
		}else if(e.getKeyCode() == KeyEvent.VK_F) {
			Window.game.pressF();
		}else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Window.game.pressSpace();
		}else if(e.getKeyCode() == KeyEvent.VK_J) {
			Window.game.pressJ();
		}else if(e.getKeyCode() == KeyEvent.VK_K) {
			Window.game.pressK();
		}else if(e.getKeyCode() == KeyEvent.VK_L) {
			Window.game.pressL();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(Window.game == null) return;
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Window.game.releaseS();
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			Window.game.releaseD();
		}else if(e.getKeyCode() == KeyEvent.VK_F) {
			Window.game.releaseF();
		}else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Window.game.releaseSpace();
		}else if(e.getKeyCode() == KeyEvent.VK_J) {
			Window.game.releaseJ();
		}else if(e.getKeyCode() == KeyEvent.VK_K) {
			Window.game.releaseK();
		}else if(e.getKeyCode() == KeyEvent.VK_L) {
			Window.game.releaseL();
		}	
	}

}
