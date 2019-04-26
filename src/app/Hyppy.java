package app;

public class Hyppy {
	
	private double pituus;
	private double tyyliPiste;
	
	public Hyppy() {
		
	}
	
	public void setPituus(double pituus) {
		this.pituus = pituus;
	}
	
	public double getPituus() {
		return pituus;
	}
	
	public void setTyylipiste(double pisteet) {
		tyyliPiste = pisteet;
	}
	
	public double getTyylipiste() {
		return tyyliPiste;
	}
	
	@Override
	public String toString() {
		return "Pituus: " + pituus + ", Pisteet: " + tyyliPiste;
	}
}
