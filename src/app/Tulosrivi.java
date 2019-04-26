package app;

public class Tulosrivi {

	private Hyppy hyppy;
	
	public Tulosrivi(Hyppy hyppy) {
		this.hyppy = hyppy;
	}
	
	@Override
	public String toString() {
		return hyppy.toString();
	}
}
