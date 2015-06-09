// File: Rectangle.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		this(1.0, 1.0);
	}
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super();
		setWidth(width);
		setLength(length);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return (width * length);
	}
	
	
	@Override
	public double getPerimeter() {
		return ((width * 2) + (length * 2));
	}
	public String toString() {
		return "A Rectangle with width =  " + getWidth() + " and length =  " + getLength() + ", which is a subclass of " + super.toString();
	}
}