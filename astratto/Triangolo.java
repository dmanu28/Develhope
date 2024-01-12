package astratto;

public class Triangolo extends Forma {

	public Triangolo(double base, double altezza) {
		super(base, altezza);
		
	}

	@Override
	public void calcolaArea() {
		super.setArea(super.getBase()* super.getAltezza()/2);
		
	}
	
	

}
