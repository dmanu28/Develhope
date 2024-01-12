package esenum;

public enum FormaEnum {
	
	TRIANGOLO(0.0),
	RETTANGOLO(0.0);
	
	private double area;
	
	FormaEnum(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	
}
