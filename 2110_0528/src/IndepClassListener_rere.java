import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener_rere extends JFrame{
	IndepClassListener_rere(){
		setTitle("Acction �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn); 
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else 
					b.setText("Action");
				setTitle(b.getText());
			}
		});
		
		setSize(250,120);
		setVisible(true);
	} 
public static void main(String[] args) {
	new IndepClassListener_rere();
}
}