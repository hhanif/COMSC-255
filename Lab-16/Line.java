// File: Line.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna




public class Line {

	private Point begin;
	private Point end;
	
	//constructors
	public Line (int beginX, int beginY, int endX, int endY)
	{
		begin = new Point (beginX, beginY);
		end = new Point ( endX, endY);
	}

	public Line (Point begin, Point end)
	{
		this.setBegin(begin);
		this.setEnd(end);
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Line start-" + this.begin.toString() 
				+ ", Line end- " + this.end.toString();
	}
}
