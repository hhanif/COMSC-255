//package TestGUI9;
// File: TestDraw9.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


class MyLine
{
   private int x1; // x coordinate of first endpoint
   private int y1; // y coordinate of first endpoint
   private int x2; // x coordinate of second endpoint
   private int y2; // y coordinate of second endpoint
   private Color myColor; // color of this shape

   // constructor initializes private vars with default values
   public MyLine()
   {
      this( 0, 0, 0, 0, Color.BLACK ); // call constructor to set values
   } // end MyLine no-argument constructor

   // constructor with input values
   public MyLine( int x1, int y1, int x2, int y2, Color color )
   {
      setX1( x1 ); // set x coordinate of first endpoint
      setY1( y1 ); // set y coordinate of first endpoint
      setX2( x2 ); // set x coordinate of second endpoint
      setY2( y2 ); // set y coordinate of second endpoint
      setColor( color ); // set the color
   } // end MyLine constructor

   // set the x-coordinate of the first point
   public void setX1( int x1 )
   {
     this.x1 = ( x1 >= 0 ? x1 : 0 );
   } // end method setX1

   // get the x-coordinate of the first point
   public int getX1()
   {
     return x1;
   } // end method getX1

   // set the x-coordinate of the second point
   public void setX2( int x2 )
   {
     this.x2 = ( x2 >= 0 ? x2 : 0 );
   } // end method setX2

   // get the x-coordinate of the second point
   public int getX2()
   {
     return x2;
   } // end method getX2

   // set the y-coordinate of the first point
   public void setY1( int y1 )
   {
     this.y1 = ( y1 >= 0 ? y1 : 0 );
   } // end method setY1

   // get the y-coordinate of the first point
   public int getY1()
   {
     return y1;
   } // end method getY1

   // set the y-coordinate of the second point
   public void setY2( int y2 )
   {
     this.y2 = ( y2 >= 0 ? y2 : 0 );
   } // end method setY2

   // get the y-coordinate of the second point
   public int getY2()
   {
     return y2;
   } // end method getY2

   // set the color
   public void setColor( Color color )
   {
      myColor = color;
   } // end method setColor

   // get the color
   public Color getColor()
   {
      return myColor;
   } // end method getColor
   
   // draw the line in the specified color
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      g.drawLine( getX1(), getY1(), getX2(), getY2() );
   } // end method draw
} // end class MyLine


class MyOval
{
   private int x1; // x coordinate of first endpoint
   private int y1; // y coordinate of first endpoint
   private int x2; // x coordinate of second endpoint
   private int y2; // y coordinate of second endpoint
   private Color myColor; // Color of this oval
   private boolean filled; // whether this shape is filled

   // constructor initializes private vars with default values
   public MyOval()
   {
      this( 0, 0, 0, 0, Color.BLACK, false ); // call constructor
   } // end MyOval no-argument constructor

   // constructor with input values
   public MyOval( int x1, int y1, int x2, int y2,
      Color color, boolean isFilled )
   {
      setX1( x1 ); // set x coordinate of first endpoint
      setY1( y1 ); // set y coordinate of first endpoint
      setX2( x2 ); // set x coordinate of second endpoint
      setY2( y2 ); // set y coordinate of second endpoint
      setColor( color ); // set the color
      setFilled( isFilled );
   } // end MyOval constructor

   // set the x-coordinate of the first point
   public void setX1( int x1 )
   {
     this.x1 = ( x1 >= 0 ? x1 : 0 );
   } // end method setX1

   // get the x-coordinate of the first point
   public int getX1()
   {
     return x1;
   } // end method getX1

   // set the x-coordinate of the second point
   public void setX2( int x2 )
   {
     this.x2 = ( x2 >= 0 ? x2 : 0 );
   } // end method setX2

   // get the x-coordinate of the second point
   public int getX2()
   {
     return x2;
   } // end method getX2

   // set the y-coordinate of the first point
   public void setY1( int y1 )
   {
     this.y1 = ( y1 >= 0 ? y1 : 0 );
   } // end method setY1

   // get the y-coordinate of the first point
   public int getY1()
   {
     return y1;
   } // end method getY1

   // set the y-coordinate of the second point
   public void setY2( int y2 )
   {
     this.y2 = ( y2 >= 0 ? y2 : 0 );
   } // end method setY2

   // get the y-coordinate of the second point
   public int getY2()
   {
     return y2;
   } // end method getY2

   // set the color
   public void setColor( Color color )
   {
      myColor = color;
   } // end method setColor

   // get the color
   public Color getColor()
   {
      return myColor;
   } // end method getColor
   
   // get upper left x coordinate
   public int getUpperLeftX()
   {
      return Math.min( getX1(), getX2() );
   } // end method getUpperLeftX

   // get upper left y coordinate
   public int getUpperLeftY()
   {
      return Math.min( getY1(), getY2() );
   } // end method getUpperLeftY

   // get shape width
   public int getWidth()
   {
      return Math.abs( getX2() - getX1() );
   } // end method getWidth

   // get shape height
   public int getHeight()
   {
      return Math.abs( getY2() - getY1() );
   } // end method getHeight
      
   // determines whether this shape is filled
   public boolean isFilled()
   {
      return filled;
   } // end method isFilled
   
   // sets whether this shape is filled
   public void setFilled( boolean isFilled )
   {
      filled = isFilled;
   } // end method setFilled
   
   // draws an oval in the specified color
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      
      if ( isFilled() )
         g.fillOval( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
      else
         g.drawOval( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
   } // end method draw
} // end class MyOval


class MyRectangle
{
   private int x1; // x coordinate of first endpoint
   private int y1; // y coordinate of first endpoint
   private int x2; // x coordinate of second endpoint
   private int y2; // y coordinate of second endpoint
   private Color myColor; // Color of this rectangle
   private boolean filled; // whether this shape is filled

   // constructor initializes private vars with default values
   public MyRectangle()
   {
      this( 0, 0, 0, 0, Color.BLACK, false ); // call constructor
   } // end MyRectangle no-argument constructor

   // constructor with input values
   public MyRectangle( int x1, int y1, int x2, int y2,
      Color color, boolean isFilled )
   {
      setX1( x1 ); // set x coordinate of first endpoint
      setY1( y1 ); // set y coordinate of first endpoint
      setX2( x2 ); // set x coordinate of second endpoint
      setY2( y2 ); // set y coordinate of second endpoint
      setColor( color ); // set the color
      setFilled( isFilled );
   } // end MyRectangle constructor

   // set the x-coordinate of the first point
   public void setX1( int x1 )
   {
     this.x1 = ( x1 >= 0 ? x1 : 0 );
   } // end method setX1

   // get the x-coordinate of the first point
   public int getX1()
   {
     return x1;
   } // end method getX1

   // set the x-coordinate of the second point
   public void setX2( int x2 )
   {
     this.x2 = ( x2 >= 0 ? x2 : 0 );
   } // end method setX2

   // get the x-coordinate of the second point
   public int getX2()
   {
     return x2;
   } // end method getX2

   // set the y-coordinate of the first point
   public void setY1( int y1 )
   {
     this.y1 = ( y1 >= 0 ? y1 : 0 );
   } // end method setY1

   // get the y-coordinate of the first point
   public int getY1()
   {
     return y1;
   } // end method getY1

   // set the y-coordinate of the second point
   public void setY2( int y2 )
   {
     this.y2 = ( y2 >= 0 ? y2 : 0 );
   } // end method setY2

   // get the y-coordinate of the second point
   public int getY2()
   {
     return y2;
   } // end method getY2

   // set the color
   public void setColor( Color color )
   {
      myColor = color;
   } // end method setColor

   // get the color
   public Color getColor()
   {
      return myColor;
   } // end method getColor
   
   // get upper left x coordinate
   public int getUpperLeftX()
   {
      return Math.min( getX1(), getX2() );
   } // end method getUpperLeftX

   // get upper left y coordinate
   public int getUpperLeftY()
   {
      return Math.min( getY1(), getY2() );
   } // end method getUpperLeftY

   // get shape width
   public int getWidth()
   {
      return Math.abs( getX2() - getX1() );
   } // end method getWidth

   // get shape height
   public int getHeight()
   {
      return Math.abs( getY2() - getY1() );
   } // end method getHeight
      
   // determines whether this shape is filled
   public boolean isFilled()
   {
      return filled;
   } // end method isFilled
   
   // sets whether this shape is filled
   public void setFilled( boolean isFilled )
   {
      filled = isFilled;
   } // end method setFilled
   
   // draws a rectangle in the specified color
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      
      if ( isFilled() )
         g.fillRect( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
      else
         g.drawRect( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
   } // end method draw
} // end class MyRectangle


class DrawPanel extends JPanel
{
   private Random randomNumbers = new Random();
   
   private MyLine[] lines; // array of lines
   private MyOval[] ovals; // array of ovals
   private MyRectangle[] rectangles; // array of rectangles
   
   // String containing shape statistic information
   private String statusText;

   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground( Color.WHITE );
      
      lines = new MyLine[ 1 + randomNumbers.nextInt( 5 ) ];
      ovals = new MyOval[ 1 + randomNumbers.nextInt( 5 ) ];
      rectangles = new MyRectangle[ 1 + randomNumbers.nextInt( 5 ) ];

      // create lines
      for ( int count = 0; count < lines.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 450 );
         int y1 = randomNumbers.nextInt( 450 );
         int x2 = randomNumbers.nextInt( 450 );
         int y2 = randomNumbers.nextInt( 450 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
         
         // add the line to the list of lines to be displayed
         lines[ count ] = new MyLine( x1, y1, x2, y2, color );
      } // end for

      // create ovals
      for ( int count = 0; count < ovals.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 450 );
         int y1 = randomNumbers.nextInt( 450 );
         int x2 = randomNumbers.nextInt( 450 );
         int y2 = randomNumbers.nextInt( 450 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
         
         // get filled property
         boolean filled = randomNumbers.nextBoolean();
         
         // add the oval to the list of ovals to be displayed
         ovals[ count ] = new MyOval( x1, y1, x2, y2, color, filled );
      } // end for

      // create rectangles
      for ( int count = 0; count < rectangles.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 450 );
         int y1 = randomNumbers.nextInt( 450 );
         int x2 = randomNumbers.nextInt( 450 );
         int y2 = randomNumbers.nextInt( 450 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );

         // get filled property
         boolean filled = randomNumbers.nextBoolean();

         // add the rectangle to the list of rectangles to be displayed
         rectangles[ count ] =
            new MyRectangle( x1, y1, x2, y2, color, filled );
      } // end for
      
      // create the status bar text
      statusText = String.format( " %s: %d, %s: %d, %s: %d",
         "Lines", lines.length, "Ovals", ovals.length,
         "Rectangles", rectangles.length );
   } // end DrawPanel constructor

   // returns a String containing shape statistics on this panel
   public String getLabelText() 
   {
      return statusText;
   } // end method getLabelText   
   
   // for each shape array, draw the individual shapes
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // draw the lines
      for ( MyLine line : lines )
         line.draw( g );

      // draw the ovals
      for ( MyOval oval: ovals )
         oval.draw( g );

      // draw the rectangles
      for ( MyRectangle rectangle : rectangles )
         rectangle.draw( g );
   } // end method paintComponent
} // end class DrawPanel


public class TestDraw9
{
   public static void main( String[] args )
   {
      DrawPanel panel = new DrawPanel();      
      JFrame application = new JFrame();
      
      // create a JLabel containing the shape information
      JLabel statusLabel = new JLabel( panel.getLabelText() );
      
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      application.add( panel ); // add drawing to CENTER by default
      
      // add the status label to the SOUTH (bottom) of the frame
      application.add( statusLabel, BorderLayout.SOUTH );
      
      application.setSize( 500, 500 );
      application.setVisible( true );
   } // end main
} // end class TestDraw9
