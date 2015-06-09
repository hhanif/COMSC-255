// File: ButtonTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 14.16: ButtonTest.java
// Testing ButtonFrame.
import javax.swing.JFrame;

public class ButtonTest 
{
   public static void main( String[] args )
   { 
      ButtonFrame buttonFrame = new ButtonFrame(); // create ButtonFrame
      buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      buttonFrame.setSize( 275, 110 ); // set frame size
      buttonFrame.setVisible( true ); // display frame
   } // end main
} // end class ButtonTest
