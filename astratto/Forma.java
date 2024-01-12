package astratto;

public abstract class Forma {
	
	private double base;
	private double altezza;
	private double area;
	
	
	
	public Forma(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltezza() {
		return altezza;
	}


	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public abstract void calcolaArea(); 
}
