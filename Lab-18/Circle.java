// File: Circle.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna


public class Circle extends Shape {
	private double radius;
	
	
	public Circle ()
	{
		this(1.0);
	}
	public Circle (double radius)
	{
		super();
		setRadius(radius);
	}
	public Circle (double radius, String color, boolean filled)
	{
		super (color, filled);
		setRadius(radius);
	}
	
	
	//methods
	@Override
	public double getArea() { return (radius * radius * Math.PI); };
	@Override
	public double getPerimeter() { return ( 2 * Math.PI * radius ); }; //circumference
	
	public String toString ()
	{
		return "A Circle with radius = " + getRadius()+ ", which is a subclass of \n " + super.toString();
	}
	
	//getters&setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
