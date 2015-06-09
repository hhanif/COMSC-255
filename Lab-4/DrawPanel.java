// File: DrawPanel.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	// draws an X from the corners of the panel 
		public void paintComponent( Graphics g )
	{
	// call paintComponent to ensure the panel displays correctly
		super.paintComponent( g );
		int width = getWidth(); // total width 
		int height = getHeight(); // total height
	// draw a line from the upper-left to the lower-right
		//g.drawLine( 0, 0, width, height );
	// draw a line from the lower-left to the upper-right
		//g.drawLine( 0, height, width, 0 ); 
        int var = 0;
        int var2 = 0;
        int increment = height/10;
        int increment2 = width/10;

        int loop = 0;
        while (loop < 10) {
            var = var + increment;
            var2 = var2 + increment2;
            
    		g.drawLine( 0, var, var2, height );
    		loop++;
        }
        var = 0;
        var2 = 0;
        int count = 0;
        while(count < 10) {
            var = var + increment;
            var2 = var2 + increment2;
        	
    		g.drawLine( var2, 0, width, var );
            count++;
		}
        
		} // end method paintComponent
}
