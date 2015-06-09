// Fig. 15.6: ShowColors.java
 // Demonstrating Colors.
import javax.swing.JFrame;

 public class ShowColors {

		// execute application
		public static void main( String[] args ) {
		 // create frame for ColorJPanel
		 JFrame frame = new JFrame( "Using colors" );
		 frame. setDefaultCloseOperation( JFrame. EXIT_ON_CLOSE );
		
		 ColorJPanel ColorJPanel = new ColorJPanel () ; // create ColorJPanel
		 frame.add( ColorJPanel ); // add ColorJPanel to frame
		 frame.setSize( 400, 180 ); // set frame size
		 frame.setVisible( true ); // display frame
		 } // end main
		 } // end class ShowColors
