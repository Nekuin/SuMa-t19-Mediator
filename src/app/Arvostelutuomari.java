package app;

import java.util.Random;

public class Arvostelutuomari {
	
	private Random random;

	public Arvostelutuomari() {
		random = new Random();
	}
	
	
	public int annaPisteet() {
		return random.nextInt(10)+1;
	}
}
