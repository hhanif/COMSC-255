// File: Point.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna



public class Point {

	private int x;
	private int y;
	
	//constructor
	public Point() { this(1,1); };
	
	public Point( int a, int b)
	{
		setX(a);
		setY(b);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString () {
		return "Point: (" + x + ", " + y + ")";
	}
}
