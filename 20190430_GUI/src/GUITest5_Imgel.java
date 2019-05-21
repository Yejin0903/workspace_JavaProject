import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_Imgel {
	public static void main(String[] args) {
				JFrame frame=new JFrame("창이름");
				JPanel panel=new JPanel();
				frame.setPreferredSize(new Dimension(400,600));
				
				//ImageIcon, JLabel
				ImageIcon kookie=new ImageIcon("src/images/kookie.jpg");
				JLabel imageLabel=new JLabel(kookie);
				
				//ImageIcon, JButton
				ImageIcon chimmy=new ImageIcon("src/images/chimmy.png");
				
				//ImageIcon 크기 수정
				ImageIcon smallchimmy=new ImageIcon(chimmy.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
				JButton imageButton=new JButton(smallchimmy);
				
				panel.add(imageLabel);
				panel.add(imageButton);
				frame.add(panel);
				
				frame.pack();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
