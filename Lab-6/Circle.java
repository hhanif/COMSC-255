import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Circle extends JApplet implements ActionListener { 
private JButton pressButton = new JButton("Smile"); 
private JButton pressaButton = new JButton("Frown"); 
private boolean isSmileyFace = true; 

public void init() { 
Container con = getContentPane(); 
con.setLayout(new FlowLayout()); 
con.add(pressButton); 
con.add(pressaButton); 
pressButton.addActionListener(this); 
pressaButton.addActionListener(this);
} 

public void paint(Graphics g) { 

if (isSmileyFace) 
drawSmile(g); 
else 
drawFrown(g); 

pressButton.repaint(); 
pressaButton.repaint(); 
} 

private void drawFace(Graphics g) 
{ 
g.setColor(Color.yellow); 
g.drawArc(0, 0, 200, 200, 360, 360); 
g.fillArc(0, 0, 200, 200, 360, 360); 
g.setColor(Color.black); 
g.drawOval(65, 75, 40, 60); 
g.fillOval(65, 75, 40, 60); 
g.drawOval(125, 75, 35, 60); 
g.fillOval(125, 75, 35, 60); 
} 

private void drawSmile(Graphics g) { 
drawFace(g); 
g.drawArc(55, 160, 90, 30, 180, 180); 
} 

private void drawFrown(Graphics g) { 
drawFace(g); 
g.drawArc(55, 160, 90, 30, 0, 180); 
} 

public void actionPerformed(ActionEvent e) { 
Object source = e.getSource(); 
if (source == pressButton) { 
isSmileyFace = true; 
repaint(); 
} else if (source == pressaButton) { 
isSmileyFace = false; 
repaint(); 
} 
} 
} 
