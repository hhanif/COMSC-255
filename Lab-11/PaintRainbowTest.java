// File: PaintRainbowTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
package ArrayListTest;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintRainbowTest extends JPanel {

	// define indigo and violet
	private final static Color VIOLET = new Color( 128, 0, 128 ); 
	private final static Color INDIGO = new Color( 75, 0, 130 );
	// colors to use in the rainbow, starting from the innermost 
	// The two white entries result in an empty arc in the center 
	private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
	// constructor 
	public PaintRainbowTest() {
	setBackground( Color.WHITE ); // set the background to white 
	} // end DrawRainbow constructor
	// draws a rainbow using concentric arcs 
	public void paintComponent( Graphics g ) {
	super.paintComponent( g );
	int radius = 20; // radius of an arc
	// draw the rainbow near the bottom-center 
	int centerX = getWidth() / 2;
	int centerY = getHeight() - 10;
	// draws filled arcs starting with the outermost
/*	for ( int counter = colors.length ; counter > 0; counter-- ) {
		// set the color for the current arc 
		g.setColor( colors[ counter - 1 ] );
		// fill the arc from 0 to 180 degrees 
		g.fillArc( centerX - counter * radius,
		centerY - counter * radius,
		counter * radius * 2, counter * radius * 2, 0, 180 );
}
*/
	g.setColor(colors[8]);
	g.fillArc( centerX - 8 * radius,
	centerY - 8 * radius,
	8 * radius * 2, 8 * radius * 2, 0, 180 );
	
	g.setColor(colors[7]);
	g.fillArc( centerX - 7 * radius,
	centerY - 7 * radius,
	7 * radius * 2, 7 * radius * 2, 0, 180 );
	
	g.setColor(colors[6]);
	g.fillArc( centerX - 6 * radius,
			centerY - 6 * radius,
			6 * radius * 2, 6 * radius * 2, 0, 180 );
	g.setColor(colors[0]);
	g.fillArc( centerX - 5 * radius,
			centerY - 5 * radius,
			5 * radius * 2, 5 * radius * 2, 0, 180 );


	
	}
	public static void main( String[] args ) {
		PaintRainbowTest panel = new PaintRainbowTest();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel ); 
		application.setSize( 400, 250 ); 
		application.setVisible( true );
	}
}
