// File: Circle.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Circle {
	private double radius;
	private String color;
	public Circle() {
		this(1.0, "RED");
	}
	public Circle(double radius) {
		this.radius = radius;
		this.color = color;
	}
	public Circle( double radius, String color) {
		super();
		 this.radius = radius;
		 this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		return String.format("Circle: Radius: %.2f\nArea: %.2f\nColor: %s\n", getRadius(), getArea(), getColor());
	}
	
}
