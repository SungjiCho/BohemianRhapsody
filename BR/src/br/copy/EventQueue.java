package br.copy;

import java.util.*;

public class EventQueue {
	
	private Event e1;
	private Event e2;
	private Event e3;
	private Event e4;
	private Event e5;
	private Event e6;
	private Event e7;
	
	private Queue<Event> eq;
	
	public EventQueue() {
		this.eq = new LinkedList<Event>();
		
		this.e1 = new Event("formBand"); eq.offer(e1);
//		this.e2 = new Event("performBand"); eq.offer(e2);
//		this.e3 = new Event("metMary"); eq.offer(e3);
//		this.e4 = new Event("formQueen"); eq.offer(e4);
//		this.e5 = new Event("composeBohemian"); eq.offer(e5);
//		this.e6 = new Event("confusePaul"); eq.offer(e6);
//		this.e7 = new Event("liveAid"); eq.offer(e7);
	}

	public void poll() {	
		eq.poll();	
	}

}
