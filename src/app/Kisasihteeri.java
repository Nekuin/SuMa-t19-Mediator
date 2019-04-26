package app;

public class Kisasihteeri {

	
	public Kisasihteeri() {
		
	}
	
	public double laskePisteet(double arvosteluPisteet, double pituus) {
		if(pituus < 150) {
			return (arvosteluPisteet+pituus);
		} else if(pituus >= 150 && pituus < 200) {
			return (arvosteluPisteet+pituus)*1.1;
		} else if(pituus >= 200) {
			return (arvosteluPisteet+pituus)*1.5;
		}
		return 0;
	}
	
}
