// File: Circle.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Circle implements GeometricObjects{
	protected double radius;
	

	public Circle ()
	{
		this.radius = 1.0;
	}
	public Circle (double radius)
	{
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius()
				+ ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
	@Override
	public double getArea() 
	{ 
		return (radius * radius * Math.PI); 
	};
	@Override
	public double getPerimeter() 
	{ 
		return ( 2 * Math.PI * radius ); 
	}; //circumference


}
