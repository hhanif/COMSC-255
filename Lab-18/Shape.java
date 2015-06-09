// File: Shape.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this("green", true);
	}
	public Shape(String c, boolean f) {
		setColor(c);
		setFilled(f);
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	protected abstract double getArea();
	protected abstract double getPerimeter();

	public String toString() {
		if(isFilled() == true) {
			return "A shape with color of " + this.getColor() + " is filled";	
		}
		else {
			return "A shape with color of " + this.getColor() + " is not filled";
		}
	}
	
}
