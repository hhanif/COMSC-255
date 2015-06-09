// File: Part1.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.ItemSelectable;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;


class Countries {
	private String name;
	private int gdp;
	private int population;
	private int ppp;

	public Countries(String name, int gdp, int population) {
		super();
		this.name = name;
		this.gdp = gdp;
		this.population = population;
		this.ppp = (int) ((((double)gdp)/population)*1000);
	}
	public void setppp(int ppp) {
		this.ppp = ppp;
	}
	public int getppp() {
		return ppp;
	} 
} //ends countries


public class Part1 extends JFrame {
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
			g.setColor( new Color( 255, 0, 0 ) );
			//g.fillRect( 15, 25, 173135/500, 20 );
			//g.drawString( "Current RGB: " + g.getColor(), 130, 40 );   

		}
		public void bars(Graphics g) {

			g.setColor( new Color( 255, 0, 0 ) );
			g.fillRect( 15, 50, 100, 20 );
			g.drawString( "Current RGB: " + g.getColor(), 130, 40 );   
			repaint();
		}
	} 



	public Part1() { //Main panel, this is where you add items to the panels.
		Wealth = new JRadioButton( "Wealth", false );
		Stength = new JRadioButton( "Stength", false );
		Population = new JRadioButton( "Population", false );
		top = new JRadioButton( "Top", false );
		bottom = new JRadioButton( "bottom", false );
		plot = new JButton("PLOT");
		label1 = new JLabel( "Number of Countries", 
				SwingConstants.RIGHT);


		JPanel p1 = new JPanel(new BorderLayout());
		//Changed to final
		 final ColorPanel colorJPanel = new ColorPanel();
		colorJPanel.setBackground(Color.GRAY);
		p1.add(colorJPanel);


		ArrayList<String> rawList = new ArrayList<String>();
		rawList.add("\"Monaco\",6406,37"); 
		rawList.add("\"Liechtenstein\",3340,22");
		rawList.add("\"Luxembourg\",60402,563");
		rawList.add("\"Qatar\",210002,2334");
		rawList.add("\"Switzerland\",712050,8212");
		rawList.add("\"Cayman Islands\",3665,57");
		rawList.add("\"Australia\",1444189,23822");
		rawList.add("\"Denmark\",340806,5660");
		rawList.add("\"Sweden\",570137,9760");

		JComboBox lists  = new JComboBox();
		for(int i = 0; i < rawList.size(); i++)
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

		Object indexnum = lists.getSelectedItem();
		Graphics g = colorJPanel.getGraphics();

		plot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// determine whether item selected

				if(Wealth.isSelected()) {
					colorJPanel.bars(colorJPanel.getGraphics());
					colorJPanel.repaint();
				}
				if(Population.isSelected()) {

				}

					if(Stength.isSelected()) {

						//System.out.println("Good job"); //testing
					}
				if(top.isSelected()){

				}
				if(bottom.isSelected()){

				}
			}});

		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.NORTH);
	} //end part1() class


	public static void main(String[] args) {
		Part1 frame = new Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle("COMSC255 Term Project by Haris Hanif");
		frame.setSize(650, 400 ); 
		frame.setVisible( true );

	} //ends main
} //end Jpanel
