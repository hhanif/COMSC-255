// File: BarChartTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 15.5: ColorJPanel .java
 // Demonstrating Colors.
 import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

 @SuppressWarnings("serial")
class ColorJPanel extends JPanel {
 // draw rectangles and Strings in different colors
 public void paintComponent( Graphics g )
 {
 super.paintComponent( g ) ; // call superclass's paintComponent 13
 this.setBackground( Color.WHITE );

 // set new drawing color using integers
 g.setColor( new Color( 255, 0, 0 ) );
 g.fillRect( 15, 25, 50, 20 );
 g.drawString( "Current RGB: " + g.getColor() , 130, 40);

 // set new drawing color using floats
 g.setColor( new Color( 0.50f, 0.75f, 0.0f ) );
 g.fillRect( 15, 50, 100, 20 );
 g.drawString( "Current RGB: " + g.getColor() , 130, 65);

 // set new drawing color using static Color objects
 g.setColor( Color. BLUE );
 g.fillRect( 15, 75, 35, 20 );
 g.drawString( "Current RGB: " + g.getColor(), 130, 90 );

 // display individual RGB values
 Color color = Color.MAGENTA;
 g.setColor( color );
 g.fillRect( 15, 100, 80, 20 );
 g.drawString( "RGB values: " + color. getRed() + ", " + color.getGreen() + ", " + color.getBlue(), 130, 115 );
 } // end method pai ntComponent
 } // end class ColorJPanel
 

public class BarChartTest {
	// execute application
	public static void main( String[] args ) {
	 // create frame for ColorJPanel
	 JFrame frame = new JFrame( "Bar Chart Test" );
	 frame. setDefaultCloseOperation( JFrame. EXIT_ON_CLOSE );
	
	 ColorJPanel ColorJPanel = new ColorJPanel () ; // create ColorJPanel
	 frame.add( ColorJPanel ); // add ColorJPanel to frame
	 frame.setSize( 400, 180 ); // set frame size
	 frame.setVisible( true ); // display frame
	 } // end main
	 } // end class ShowColors
