// File: FormTest.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
import javax.swing.*;

import java.awt.GridLayout;


public class FormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JTextField
		JTextField field1 = new JTextField("1234.56");
		JTextField field2 = new JTextField("9876.54");

		//JComboBox
		String[] items = {"Small", "Medium", "Large"};
		JComboBox combo = new JComboBox(items);
		// JFrame as a container
		//JPanel to place the components in frame
		//JOptionPane for the buttons
		
		// create a frame to hold the labels
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create components for each row
		JPanel panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("Size: "));
		panel.add(combo);
		panel.add(new JLabel ("Field 1: "));
		panel.add(field1);
		panel.add(new JLabel ("Field 2: "));
		panel.add(field2);
		
		//JOptionPane
		int result = JOptionPane.showConfirmDialog(null,  panel, "Test Form", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if(result == JOptionPane.OK_OPTION) {
			System.out.print(combo.getSelectedItem() + " " + field1.getText() + " " + field2.getText());
		}
			else {
				System.out.println("Cancelled");	
			}
			

		
	}

}
