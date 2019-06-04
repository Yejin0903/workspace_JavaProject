package images;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_Event {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Event");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
	
		//JTextField,JButton,JLabel
		JTextField tfInput=new JTextField(10);
		JButton btRun=new JButton("=>");
		JLabel lbOutput=new JLabel();
		//ActionListener �����
		ActionListener al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Action�� �߻��ϸ�,tfInput���� �ؽ�Ʈ�� �����ͼ� lbOutput�� ����
				String input=tfInput.getText();
				//lbOutput.setText("�ȳ� "+input+"��!");
				int tfInput = Integer.parseInt(input);
				lbOutput.setText(Integer.toString(tfInput*12));
			}	
		};
		//��ư�� ActionListener �߰�
		btRun.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btRun);
		panel.add(lbOutput);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
