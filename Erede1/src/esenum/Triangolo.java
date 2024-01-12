package esenum;

public class Triangolo extends Forma {

	private FormaEnum triangolo = FormaEnum.TRIANGOLO;
	
	public Triangolo(double base, double altezza) {
		super(base, altezza);
		
	}
	
	public void calcolaArea() {
		super.setArea(super.getAltezza() * super.getBase() / 2 );
		System.out.println(super.getArea());
	}

}
