import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame=new JFrame("â�̸�");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300,200));

		JLabel label=new JLabel("�¾ �� : ");
		JPanel panel=new JPanel();
		String[] picnics= {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��"};
		JComboBox<String> cb=new JComboBox<>(picnics);
		
		cb.addItem("11��");
		cb.addItem("12��");
		
		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
	    frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
