import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() {
		setTitle("FlowLayoutEx Sample"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane(); //컨텐트팬 알아내기
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); //컨텐트팬에 FlowLayout
		contentPane.add(new JButton("add")); 
		contentPane.add(new JButton("sub")); 
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200); //프레임 크기 300*150
		setVisible(true); //화면에 프레임 출력
		
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
