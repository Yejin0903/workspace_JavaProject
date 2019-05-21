import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUITest_JRadioButton {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		//JRadioButton
		JRadioButton exoButton=new JRadioButton("EXO");
		JRadioButton btsButton=new JRadioButton("BTS");
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(exoButton);
		bg.add(btsButton);
	
		panel.add(exoButton);
		panel.add(btsButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
