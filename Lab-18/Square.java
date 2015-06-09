// File: Square.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Square extends Rectangle{
	private double side;
	public Square() {
		this(1.0);
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public String toString() {
		return "A sqaure with side =  " + super.getLength() + ", which is a subclass of " + super.toString();
	}
	public double getSide() {
		return super.getLength();
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public void setWidth(double width) {
		super.setLength(width);
		super.setWidth(width);
	}
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
	}
	
}
