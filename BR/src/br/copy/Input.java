package br.copy;

public class Input extends Thread{
	public void run() {
		int i = 30;
		while(i != 0 && !isInterrupted()) {
			i--;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				interrupt();
			}
		}
	}
}
