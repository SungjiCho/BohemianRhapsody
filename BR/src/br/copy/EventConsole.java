package br.copy;

import java.io.IOException;

public class EventConsole implements Runnable{
	
	private Event eq;
	
	
	EventConsole(Event eq){ this.eq = eq; }

	@Override
	public void run() {
	}
}
