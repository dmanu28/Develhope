package astratto;

public class Rettangolo extends Forma {

	public Rettangolo(double base, double altezza) {
		super(base, altezza);
		
	}

	@Override
	public void calcolaArea() {
		super.setArea(super.getBase()* super.getAltezza());
		//System.out.println(super.getArea()); TI FA STAMPARE RIGA 14 MAIN
	}
	
	
	public String pippo = "abnd";
	
	public String pipponator() {
	
		return pippo.substring(0, 2);
		
	}
	
	

}
