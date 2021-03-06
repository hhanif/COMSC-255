// File: LineChartPanel.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;



@SuppressWarnings({ "serial", "unused"})
public class LineChartPanel extends JPanel{
	private static final int MAX_SCORE = 20;
	private static final int PREF_W = 800;
	private static final int PREF_H = 650;
	private static final int BORDER_GAP = 30;
	private static final Color GRAPH_COLOR = Color.green;
	private static final Color GRAPH_POINT_COLOR = new Color(150, 50, 50, 180);
	private static final Stroke Graph_STROKE = new BasicStroke(3f);
	private static final int GRAPH_POINT_WIDTH = 12;
	private static final int Y_HATCH_CNT = 10;
	private List<Integer> scores;
	//List<Integer> scores = new ArrayList<Integer>();
	public LineChartPanel(List<Integer> scores) {
		this.scores = scores;
	}

	@Override
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		double xScale = (double)getWidth() - 2 * BORDER_GAP / (scores.size() - 1);
		double yScale = (double)getWidth() - 2 * BORDER_GAP / (MAX_SCORE - 1);

		List<Point> graphPoints = new ArrayList<Point>();
		
		for(int i = 0; i < scores.size(); i++) {
			int x = (int)(i * xScale + BORDER_GAP);
			int y = (int)(MAX_SCORE - scores.get(i) * yScale + BORDER_GAP);
			graphPoints.add(new Point(x, y));
		}
		
		for (int i = 0; i < Y_HATCH_CNT; i++) {
			int x0 = BORDER_GAP;
			int y0 = getHeight() - ( (i + 1) * (getHeight() - BORDER_GAP * 2) ) / Y_HATCH_CNT + BORDER_GAP;
			int x1 = GRAPH_POINT_WIDTH + BORDER_GAP;
			int y1 = y0;
			g2.drawLine(x0,  y0,  x1,  y1);
		}
		
		for(int i = 0; i < scores.size(); i++) {
			int x0 = (i + 1) * (getHeight() - BORDER_GAP * 2) / (scores.size() - 1) + BORDER_GAP;
			int x1 = x0;
			int y0 = getHeight() - BORDER_GAP;
			int y1 = y0 - GRAPH_POINT_WIDTH;
			g2.drawLine(x0,  y0,  x1,  y1);
		}
		
		Stroke oldStroke = g2.getStroke();
		g2.setColor(GRAPH_COLOR);
		g2.setStroke(Graph_STROKE);
		for (int i = 0; i < graphPoints.size() - 1; i++)
		{
		int x1 = graphPoints.get(i).x;
		int y1 = graphPoints.get(i).y;
		int x2 = graphPoints.get(i+1).x;
		int y2 = graphPoints.get(i+1).y;
		g2.drawLine(x1, y1, x2, y2);
		}
		
		g2.setStroke(oldStroke);
		g2.setColor(GRAPH_POINT_COLOR);
		for(int i = 0; i < graphPoints.size(); i++) {
			int x = graphPoints.get(i).x - GRAPH_POINT_WIDTH / 2;
			int y = graphPoints.get(i).y - GRAPH_POINT_WIDTH / 2;
			int ovalW = GRAPH_POINT_WIDTH;
			int ovalH = GRAPH_POINT_WIDTH;
			g2.fillOval(x,  y,  ovalW, ovalH);
		}
	}
	public Dimension getPreferredSize() {
		return new Dimension(PREF_W, PREF_H);
	}
	
	public class LineChartTest {

		public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		Random rand = new Random();
		int maxDataPoints = 16;
		int maxScore = 20;
		for (int i = 0; i < maxDataPoints; i++) {
			scores.add(rand.nextInt(maxScore));
		}
		LineChartPanel mainPanel = new LineChartPanel(scores);
		
		JFrame frame = new JFrame("LineChartTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(mainPanel);
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
			
		}

	}


}
