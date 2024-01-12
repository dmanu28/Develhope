package esenum;

public class Rettangolo extends Forma {
	
	private FormaEnum rettangolo = FormaEnum.TRIANGOLO;
	
	public Rettangolo(double base, double altezza) {
		super(base, altezza);
		
	}
	
	public void calcolaArea() {
		super.setArea(super.getAltezza() * super.getBase() );
		System.out.println(super.getArea());
	}
}
