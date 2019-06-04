package images;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest7_Layout {

	public static void main(String[] args) {
		JFrame frame=new JFrame("√¢¿Ã∏ß");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		
		//FlowLayout f1=new FlowLayout();
		//f1.setAlignment(FlowLayout.RIGHT);
		//panel.setLayout(f1);
		
		
		//BorderLayout
		/*BorderLayout b1=new BorderLayout();
		panel.setLayout(b1);
		JButton btNorth=new JButton("NORTH");
		JButton btWest=new JButton("WEST");
		JButton btCenter=new JButton("CENTER");
		JButton btEast=new JButton("EAST");
		JButton btSouth=new JButton("SOUTH");
		
		panel.add(btNorth,BorderLayout.NORTH);
		panel.add(btWest,BorderLayout.WEST);
		panel.add(btCenter,BorderLayout.CENTER);
		panel.add(btEast,BorderLayout.EAST);
		panel.add(btSouth,BorderLayout.SOUTH);*/
		
		//GridLayout
		GridLayout g1=new GridLayout(2,3);
		
		JPanel panelCenter=new JPanel();
		panelCenter.setLayout(g1);
		//0~7 i
		for(int i=0;i<10;i++) {
			JButton bts=new JButton("Button"+i);
			panelCenter.add(bts);
			}
		
		panel.add(panelCenter, BorderLayout.CENTER);
		
		
		JPanel panelNorth = new JPanel();
		
		
		
		//0~9 i
		for(int i=0;i<10;i++) {
		JButton bts=new JButton("Button"+i);
		panelNorth.add(bts);
		}
		panel.add(panelNorth, BorderLayout.NORTH); 
		
	
	
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
