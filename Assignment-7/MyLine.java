// File: MyLine.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna


import java.awt.Color;
import java.awt.Graphics;


public class MyLine {
	private int x1, x2;
	private int y1, y2;
	private Color myColor;
	
	public MyLine(int x1, int y1, int x2, int y2, Color color)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.myColor = color;
	}
	
	
	public void draw ( Graphics g)
	{
		g.setColor(myColor);
		g.drawLine( x1, y1, x2, y2 );
	}

}
