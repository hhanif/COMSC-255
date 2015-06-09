// File: Cylinder.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Cylinder extends Circle{
	private double height;
	
	Cylinder() {
		super(); 
		this.height = 1.0;
	}
	
	Cylinder(double height) {
		 super();
		 this.height = height;

	}
	Cylinder(double height, double radius) {
		 super(radius);
		 this.height = height;

	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		double Volume = getArea() * height;
		return Volume;
	}
	public String toString() {
		return String.format("Cylinder: Radius: %.2f\nHeight: %.2f\nArea: %.2f\nVolume: %.2f\n", getRadius(), getHeight(), getArea(), getVolume());
	}
}
