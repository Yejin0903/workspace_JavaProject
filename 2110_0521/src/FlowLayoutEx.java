import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() {
		setTitle("FlowLayoutEx Sample"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane(); //����Ʈ�� �˾Ƴ���
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); //����Ʈ�ҿ� FlowLayout
		contentPane.add(new JButton("add")); 
		contentPane.add(new JButton("sub")); 
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200); //������ ũ�� 300*150
		setVisible(true); //ȭ�鿡 ������ ���
		
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
