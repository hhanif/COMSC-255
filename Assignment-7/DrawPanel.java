// File: DrawPanel.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;




@SuppressWarnings("serial")
public class DrawPanel extends JPanel {

	private Random randomNumbers = new Random();
	private MyLine[] lines;
	
	public DrawPanel()
	{
		setBackground( Color.WHITE );
		
		lines= new MyLine[ 85];
		
		int [] x = new int [4];
		x[0]=20;
		x[1]=20;
		x[2]=240;
		x[3]=240;
		
		int [] y = new int [4];
		y[0]=20;
		y[1]=240;
		y[2]=240;
		y[3]=25;
		
		int [] x2 = new int[4];
		x2[0]=20;
		x2[1]=240;
		x2[2]=240;
		x2[3]=25;
		
		int [] y2 = new int [4];
		y2[0]=240;
		y2[1]=240;
		y2[2]=25;
		y2[3]=25;
		

		
		//make rectangle lines
		int count=0;
		for (int i =0; i < 21; i++)
		{
			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256) );
			for (int j=0; j < 4; j++)
			{
				lines [count] = new MyLine(x[j], y[j], x2[j], y2[j], color);
				count++;
			}
			
			

			//change first set of points
			x[0]+=5;
			y[0]+=5;
			x2[0]+=5;
			y2[0]-=5;
			
			if (i == 20 )
				lines [count] = new MyLine(x[0], y[0], x2[0], y2[0] +5, color);
			
			//change second set of points
			x[1]+=5;
			y[1]-=5;
			x2[1]-=5;
			y2[1]-=5;
			
			//change third set of points
			x[2]-=5;
			y[2]-=5;
			x2[2]-=5;
			y2[2]+= 5;

			//change fourth set of points
			x[3]-=5;
			y[3]+=5;
			x2[3]+=5;
			y2[3]+=5;	
			
		}
		
		
		
	}//end of constructor
	
	public void paintComponent ( Graphics g)
	{
		super.paintComponent(g);
		
		for (MyLine line : lines)
			line.draw(g);
	}//end of paintComponent
}
