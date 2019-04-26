package app;

public class Hypp‰‰j‰ {
	
	private Hyppy[] hypyt;
	private Mediator mediator;
	
	public Hypp‰‰j‰() {
		hypyt = new Hyppy[2];
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void setTulokset(Hyppy...hypyt) {
		int i = 0;
		for(Hyppy h : hypyt) {
			hypyt[i] = h;
			i++;
		}
	}
	
	public Hyppy[] getTulokset() {
		return hypyt;
	}
	
	public void hypp‰‰() {
		mediator.hypp‰‰();
	}
}
