package app;

public class MediatorMain {

	public static void main(String[] args) {
		Mediator m = new Mediator();
		
		Hypp‰‰j‰ h = new Hypp‰‰j‰();
		m.setHypp‰‰j‰(h);
		
		Kisasihteeri sihteeri = new Kisasihteeri();
		m.setKisasihteeri(sihteeri);
		
		Mittamies mittamies = new Mittamies();
		m.setMittamies(mittamies);
		
		Tulostaulu taulu = new Tulostaulu();
		m.setTulostaulu(taulu);
		
		for(int i = 0; i < 5; i++) {
			m.setArvostelutuomarit(new Arvostelutuomari());
		}
		
		h.hypp‰‰();
		System.out.println("\nuusi kierros\n");
		h.hypp‰‰();
	}

}
