// File: TermProject.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;



class Nation {
	private String name;
    private int gdp;
    private int population;
    private int ppp;
    public Nation(String name, int gdp, int population) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
        this.ppp = 1000*gdp/population;
    }
    //getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGdp() {
		return gdp;
	}

	public void setGdp(int gdp) {
		this.gdp = gdp;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPpp() {
		return ppp;
	}
	public void setPpp(int ppp) {
		this.ppp = ppp;
	}
	@Override
	public String toString() {
		return "Nation [name=" + name + ", gdp=" + gdp + ", population="
				+ population + ", ppp=" + ppp + "]";
	}
	
	//define comparators for sort()
	public static class CompName implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.name.compareToIgnoreCase(c2.name));
		}
		
	}
	public static class CompGdp implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.gdp> c2.gdp ? -1 : (c1.gdp == c2.gdp ? 0 : 1));
		}
	}
	public static class CompPopulation implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.population> c2.population ? -1 : (c1.population == c2.population ? 0 : 1));
		}
	}
	public static class CompPPP implements Comparator<Nation>
	{
		@Override
		public int compare(Nation c1, Nation c2)
		{
			return (c1.ppp> c2.ppp ? -1 : (c1.ppp == c2.ppp ? 0 : 1));
		}
	}
}


public class TermProject {

	public static void main(String[] args) throws Exception {
	    
	    
		////empty filler class
		
		
	}

}


class Part1 extends JFrame {
	private JRadioButton Wealth; // selects plain text
	private JRadioButton Stength; // selects plain text
	private JRadioButton Population; // selects plain text
	private JRadioButton top; // selects plain text
	private JRadioButton bottom; // selects plain text
	private JButton plot;
	private JLabel label1;
	private JComboBox lists;

	class ColorPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent( g ); 
			/*g.setColor( new Color( 255, 0, 0 ) );
			g.fillRect( 15, 25, 173135/500, 20 );
			g.drawString( g.toString(), 130, 40 ); */  

			
		}
		public void bars(Graphics g) {

			/*g.setColor( new Color( 255, 0, 0 ) );
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
			g.fillRect( 15, 100, 80, 20 );*/
			
			repaint();
		}
	} 



	public Part1() throws Exception { //Main panel, this is where you add items to the panels.
		Wealth = new JRadioButton( "Wealth", false );
		Stength = new JRadioButton( "Stength", false );
		Population = new JRadioButton( "Population", false );
		top = new JRadioButton( "Top", false );
		bottom = new JRadioButton( "Bottom", false );
		plot = new JButton("PLOT");
		label1 = new JLabel( "Number of Countries", 
				SwingConstants.RIGHT);


		JPanel p1 = new JPanel(new BorderLayout());
		//Changed to final
		final ColorPanel colorJPanel = new ColorPanel();
		colorJPanel.setBackground(Color.GRAY);
		p1.add(colorJPanel);



		final JComboBox lists  = new JComboBox();
		for(int i = 4; i < 10; i++)
			lists.addItem(i+1);

		//====================================================
		// Panel 2: Option panel (Buttons, Radiobuttons, etc)
		//	 	
		//====================================================
		JPanel p2 = new JPanel();
		p2.add(label1);
		p2.add(lists);
		p2.add(Wealth);
		p2.add(Stength);
		p2.add(Population);
		p2.add(top);
		p2.add(bottom);
		p2.add(plot);

		//originally int
		Object indexnum = lists.getSelectedItem();
		Graphics g = colorJPanel.getGraphics();
		
		ArrayList<String> lines = new ArrayList<String>();
		final ArrayList<Nation> nations = new ArrayList<Nation>();
	
		////input lines
		URL oracle = new URL("https://api.thingspeak.com/apps/thinghttp/send_request?"
					   		+ "api_key=9XAH2EW6JT2DOW1V");
		   BufferedReader in = new BufferedReader(
		   new InputStreamReader(oracle.openStream()));

		   String inputLine;
		   while ((inputLine = in.readLine()) != null)
		   {
		       //System.out.println(inputLine); //output each line
			   String line = inputLine.substring(1, inputLine.length());
			   lines.add(line);
			   String [] filtered = line.split(",");
			   
			   
			   if (filtered.length == 3) //to ignore the first and last line
			   {
				   Nation temp = new Nation(filtered[0].substring(0, filtered[0].length() - 1), Integer.valueOf(filtered[1]), Integer.valueOf(filtered[2]));
				   nations.add(temp);
			   }
			   
		       
		   }
		   in.close();
		   
		   //remove the first and last lines. they're just empty code
		   lines.remove(0);
		   lines.remove(lines.size() - 1);
		   
		  

		plot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// determine whether item selected
				if(Wealth.isSelected()) {
					Graphics g = colorJPanel.getGraphics();
					
					Color [] colors = { Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, 
							Color.DARK_GRAY, Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PINK };
					
					int incrementY = 25;
										
					if(top.isSelected())
					{
						Collections.sort(nations, new Nation.CompGdp() );
						for (int i = 0; i < (Integer) lists.getSelectedItem(); i++)
						{
							g.setColor( colors[i] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							g.fillRect( 15, 25 + incrementY*i, (int) (1 + nations.get(i).getGdp() * .00003), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getGdp(), 600, 40 + incrementY*i);
						}
					}
					else
					{
						Collections.sort(nations,Collections.reverseOrder( new Nation.CompGdp() ) );
						for (int i = 0; i < (Integer) lists.getSelectedItem(); i++)
						{
							g.setColor( colors[i] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							g.fillRect( 15, 25 + incrementY*i, (int) (1 + nations.get(i).getGdp() * .3), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getGdp(), 600, 40 + incrementY*i);
						}
					}
					
					
				}
				
				if(Population.isSelected())
				{
					Graphics g = colorJPanel.getGraphics();
					
					Color [] colors = { Color.BLACK, Color.RED, Color.MAGENTA, Color.CYAN, Color.WHITE, 
							Color.GREEN, Color.BLUE, Color.PINK, Color.ORANGE, Color.DARK_GRAY };
					
					int incrementY = 25;
									
					if(top.isSelected())
					{
						for (int i = 0; i < (Integer) lists.getSelectedItem(); i++)
						{
							Collections.sort(nations, new Nation.CompPopulation()  );
							g.setColor( colors[i] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							g.fillRect( 15, 25 + incrementY*i, (int) (1 + nations.get(i).getPopulation() * .00003), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getPopulation(), 600, 40 + incrementY*i);
						}
					}
					else if (bottom.isSelected())
					{
						for (int i = 0; i < (Integer) lists.getSelectedItem(); i++)
						{
							Collections.sort(nations, Collections.reverseOrder(new Nation.CompPopulation()  ));
							g.setColor( colors[i] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							g.fillRect( 15, 25 + incrementY*i, (int) (1 + nations.get(i).getPopulation() * 2), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getPopulation(), 600, 40 + incrementY*i);
						}
					}
					
					
					
					
				}
				if(Stength.isSelected())
				{
						
					Graphics g = colorJPanel.getGraphics();
					
					Collections.sort(nations, new Nation.CompPPP()  );
					Color [] colors = { Color.BLACK, Color.RED, Color.MAGENTA, Color.CYAN, Color.WHITE, 
							Color.GREEN, Color.BLUE, Color.PINK, Color.ORANGE, Color.DARK_GRAY };
					
					int incrementY = 25;
									
					if (top.isSelected()) //show in ascending order
					{
						for (int i = 0; i < (Integer) lists.getSelectedItem(); i++)
						{
							Collections.sort(nations, new Nation.CompPPP()  );
							g.setColor( colors[i] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							g.fillRect( 15, 25 + incrementY*i, (int) (1 + nations.get(i).getPpp() * .0003), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getPpp(), 600, 40 + incrementY*i);
						}
					}
					else if (bottom.isSelected()) 
					{
						for (int i = 5; i < ((Integer) lists.getSelectedItem()) + 5; i++)
						{
							Collections.sort(nations, Collections.reverseOrder(new Nation.CompPPP()));
							g.setColor( colors[i-5] );
							//convert gdp into a percentage 
							//int percent = nation.get(i).getGdp() / 100; 
							
							g.fillRect( 15, 25 + incrementY*(i-5), (int) ((1 + nations.get(i).getPpp() + 40000) * .003), 20);
							g.drawString(nations.get(i).getName() + ", " + nations.get(i).getPpp(), 600, 40 + incrementY*(i-5));
						}
						
					}
					
					
				}
				
				

			}});

		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.NORTH);
	} //end part1() class


	
	
	/////PART OF CODE THAT SHOWS BOX
	public static void main(String[] args) throws Exception {
		Part1 frame = new Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle("COMSC255 Term Project by Haris Hanif");
		frame.setSize(650, 400 ); 
		frame.setVisible( true );

	} //ends main
	
	
	
	double findMax(ArrayList<Double> values)
	{
	    double max = values.get(0);
	    for (int i = 0; i < values.size(); i++)
	    {
	        if (max < values.get(i))
	            max = values.get(i);
	    }
	    
	    return max;
	}
	
	ArrayList<Double> ModifyValuesToFitBarGraph(ArrayList<Double> values, double max)
	{
	    ArrayList<Double> newValues = new ArrayList<Double>();
	    for (int i = 0; i < values.size(); i++)
	    {
	        double temp  = values.get(i) / max;
	        newValues.add(temp);
	    }
	    
	    return newValues;
	}

	
} //end Jpanel
