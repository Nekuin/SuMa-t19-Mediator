package app;

import java.util.ArrayList;
import java.util.List;

public class Tulostaulu {

	private List<String> tulokset;
	private int i;
	
	public Tulostaulu() {
		tulokset = new ArrayList<>();
		i = 1;
	}
	
	public void setTulos(Tulosrivi tulosrivi) {
		tulokset.add("Hyppy " + i + " " + tulosrivi);
		i++;
	}
	
	public void printTulokset() {
		tulokset.forEach(System.out::println);
	}
	
}
