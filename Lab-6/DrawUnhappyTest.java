// File: DrawUnhappyTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna 
// Fig. 6.12: DrawSmileyTest.java
 // Test application that displays a smiley face.
 import javax.swing.JFrame;
public class DrawUnhappyTest {

 public static void main( String[] args ) {
	 DrawUnhappy panel = new DrawUnhappy();
 JFrame application = new JFrame();

 application. setDefaultCloseOperation( JFrame. EXIT_ON_CLOSE );
 application.add( panel );
 application.setSize( 230, 250 );
 application.setVisible( true );
 } // end main
 } // end class DrawSmileyTest
