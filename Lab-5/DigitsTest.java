// File: DigitsTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

public class DigitsTest extends JApplet implements ActionListener
{

JTextField input;
JLabel prompt, display;   

 public void init()
{
 input = new JTextField( 6 );
 input.addActionListener( this );
 display = new JLabel();
 prompt = new JLabel( "Enter an integer in the range 1-100000 (0 to exit):" );
 Container c = getContentPane();
 c.setLayout( new FlowLayout() );
 c.add( prompt );
 c.add( input );
 c.add( display );
}


 public void actionPerformed( ActionEvent e )
{
 int number = Integer.parseInt( input.getText() );

 if ( number >= 1 && number <= 99999 ) {         
    showStatus( "" );
    displayDigits( number );
 }
 else if (number == 0) {
	    showStatus( "You have Exitted the program" );
	    display.setText( "" );
 }
 else {
    showStatus( "Invalid input number must be between 1 and 99999" );
    display.setText( "" );
 }
}

// Part A
public static int quotient( int a, int b )
{
 return a / b;
}

// Part B
public static int remainder( int a, int b )
{
 return a % b;       
}

// Part C
public void displayDigits( int number )
{
   int divisor = 10000;
   int digit;
   int x = 5;
   int y = 80;
   String s = "";

   while ( divisor >= 1 ) {
      digit = quotient( number, divisor );
      s += digit + "  ";
      number = remainder( number, divisor );
      divisor = quotient( divisor, 10 );
   }

   display.setText( s );
}
}
