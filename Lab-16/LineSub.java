// File: LineSub.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna




public class LineSub extends Point {
	
	private Point end;
	
	public LineSub (int beginX, int beginY, int endX, int endY)
	{
		super(beginX, beginY);
		this.setEnd(new Point (endX, endY));
	}

	public LineSub (Point begin, Point end)
	{
		super(begin.getX(), begin.getY());
		this.setEnd(end);
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	
	@Override
	public String toString() {
		return "Line start-" + super.toString() 
				+ ", Line end- " + this.end.toString();
	}
	
}
