// File: FractalPanel.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
// Fig. 18.19: Fractal.java
// Fractal user interface.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

//Fig. 18.18: FractalJPanel.java
//Drawing the "Lo fractal" using recursion.
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Fractal extends JFrame
{
   private static final int WIDTH = 400;  // define width of GUI
   private static final int HEIGHT = 480; // define height of GUI
   private static final int MIN_LEVEL = 0, MAX_LEVEL = 15;

   private JButton changeColorJButton, increaseLevelJButton,
      decreaseLevelJButton;
   private JLabel levelJLabel;
   private FractalJPanel drawSpace;
   private JPanel mainJPanel, controlJPanel;

   // set up GUI
   public Fractal()
   {
      super( "Fractal" );

      // set up control panel
      controlJPanel = new JPanel();
      controlJPanel.setLayout( new FlowLayout() );

      // set up color button and register listener
      changeColorJButton = new JButton( "Color" );
      controlJPanel.add( changeColorJButton );
      changeColorJButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process changeColorJButton event
            public void actionPerformed( ActionEvent event )
            {
               Color color = JColorChooser.showDialog(
                  Fractal.this, "Choose a color", Color.BLUE );

               // set default color, if no color is returned
               if ( color == null )
                  color = Color.BLUE;

               drawSpace.setColor( color );		  
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener

      // set up decrease level button to add to control panel and 
      // register listener
      decreaseLevelJButton = new JButton( "Decrease Level" );
      controlJPanel.add( decreaseLevelJButton );
      decreaseLevelJButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process decreaseLevelJButton event
            public void actionPerformed( ActionEvent event )
            {
               int level = drawSpace.getLevel();
               --level; // decrease level by one

               // modify level if possible
               if ( ( level >= MIN_LEVEL ) &&
                  ( level <= MAX_LEVEL ) )
               {
                  levelJLabel.setText( "Level: " + level );
                  drawSpace.setLevel( level );
                  repaint(); 
               } // end if
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener

      // set up increase level button to add to control panel
      // and register listener
      increaseLevelJButton = new JButton( "Increase Level" );
      controlJPanel.add( increaseLevelJButton );
      increaseLevelJButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process increaseLevelJButton event
            public void actionPerformed( ActionEvent event )
            {
               int level = drawSpace.getLevel();
               ++level; // increase level by one

               // modify level if possible
               if ( ( level >= MIN_LEVEL ) &&
                  ( level <= MAX_LEVEL ) )
               {
                  levelJLabel.setText( "Level: " + level );
                  drawSpace.setLevel( level );
                  repaint();
               } // end if
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener

      // set up levelJLabel to add to controlJPanel
      levelJLabel = new JLabel( "Level: 0" );
      controlJPanel.add( levelJLabel );

      drawSpace = new FractalJPanel( 0 );
 
      // create mainJPanel to contain controlJPanel and drawSpace
      mainJPanel = new JPanel();
      mainJPanel.add( controlJPanel );
      mainJPanel.add( drawSpace );

      add( mainJPanel ); // add JPanel to JFrame

      setSize( WIDTH, HEIGHT ); // set size of JFrame
      setVisible( true ); // display JFrame
   } // end constructor Fractal

   public static void main( String[] args )
   {
      Fractal demo = new Fractal();
      demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // end main
} // end class Fractal

class FractalJPanel extends JPanel
{
   private Color color; // stores color used to draw fractal
   private int level;   // stores current level of fractal

   private static final int WIDTH = 400;  // defines width of JPanel
   private static final int HEIGHT = 400; // defines height of JPanel

   // set the initial fractal level to the value specified
   // and set up JPanel specifications
   public FractalJPanel( int currentLevel )
   {
      color = Color.BLUE;  // initialize drawing color to blue
      level = currentLevel; // set initial fractal level
      setBackground( Color.WHITE );
      setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
   } // end constructor FractalJPanel

   // draw fractal recursively
   public void drawFractal( int level, int xA, int yA, int xB, 
      int yB, Graphics g )
   {
      // base case: draw a line connecting two given points
      if ( level == 0 ) 
         g.drawLine( xA, yA, xB, yB );
      else // recursion step: determine new points, draw next level
      {	
         // calculate midpoint between (xA, yA) and (xB, yB)
         int xC = ( xA + xB ) / 2;
         int yC = ( yA + yB ) / 2;

         // calculate the fourth point (xD, yD) which forms an 
         // isosceles right triangle between (xA, yA) and (xC, yC) 
         // where the right angle is at (xD, yD)
         int xD = xA + ( xC - xA ) / 2 - ( yC - yA ) / 2;
         int yD = yA + ( yC - yA ) / 2 + ( xC - xA ) / 2;
         
         // recursively draw the Fractal
         drawFractal( level - 1, xD, yD, xA, yA, g );
         drawFractal( level - 1, xD, yD, xC, yC, g );
         drawFractal( level - 1, xD, yD, xB, yB, g );  
      } // end else
   } // end method drawFractal

   // start the drawing of fractal
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // draw fractal pattern
      g.setColor( color );
      drawFractal( level, 100, 90, 290, 200, g ); 
   } // end method paintComponent

   // set the drawing color to c
   public void setColor( Color c )
   {
      color = c;
   } // end method setColor
    
   // set the new level of recursion
   public void setLevel( int currentLevel )
   {
      level = currentLevel;
   } // end method setLevel

   // returns level of recursion 
   public int getLevel()
   {
      return level;
   } // end method getLevel
} // end class FractalJPanel
