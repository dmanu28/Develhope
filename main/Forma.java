package main;

public class Forma {
	private double base;
	private double altezza;
	private double area;
	
	public Forma(double base, double altezza) {
		super();
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
	
	public void calcolaArea() {
		this.setArea(this.base * this.altezza);
		System.out.println(this.getArea());
	}
	
}
