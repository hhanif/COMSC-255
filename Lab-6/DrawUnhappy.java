// File: DrawUnhappy.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 
// Fig. 6.11: DrawSmiley.java
 // Demonstrates filled shapes.
 import java.awt.Color;
 import java.awt.Graphics;
 import javax.swing.JPanel;
 
public class DrawUnhappy extends JPanel{

 public void paintComponent( Graphics g )
 {
	 super.paintComponent( g );

 // draw the face
 g.setColor( Color.YELLOW );
 g.fillOval( 10, 10, 200, 200 );

 // draw the eyes
 g.setColor( Color. BLACK );
 g.fillOval( 55, 65, 30, 30 );
 g.fillOval( 135, 65, 30, 30 );

 // draw the mouth
 g.fillOval( 50, 110, 120, 60 );

 
 // "touch up" the mouth into a smile
 g.setColor( Color.YELLOW );
 g.fillRect( 50, 140, 130, 40 );
 
 g.fillOval( 50, 120, 120, 40 );
 
 } // end method paintComponent
 } // end class DrawSmiley
