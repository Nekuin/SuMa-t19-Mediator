package app;

import java.util.Random;

public class Mittamies {
	
	private Random r;

	public Mittamies() {
		r = new Random();
	}
	
	//140-240
	public int mittaaPituus() {
		return r.nextInt(100)+140;
	}
	
	
}
