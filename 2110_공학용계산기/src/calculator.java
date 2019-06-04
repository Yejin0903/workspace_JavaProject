import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
public class calculator extends JFrame {
	calculator() {
		setTitle("공학용 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		GridLayout grid=new GridLayout(7,5);
		c.setLayout(grid);
		
		c.add(new JButton("x2"));
		c.add(new JButton("xy"));
		c.add(new JButton("sin"));
		c.add(new JButton("cos"));
		c.add(new JButton("tan"));
		
		c.add(new JButton("v-"));
		c.add(new JButton("10x"));
		c.add(new JButton("log"));
		c.add(new JButton("Exp"));
		c.add(new JButton("Mod"));
		
		c.add(new JButton("↑"));
		c.add(new JButton("CE"));
		c.add(new JButton("C"));
		c.add(new JButton("<x"));
		c.add(new JButton("/"));
		
		c.add(new JButton("ㅠ"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("x"));
		
		c.add(new JButton("n!"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("-"));
		
		c.add(new JButton("+-"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("+"));
		
		c.add(new JButton("("));
		c.add(new JButton(")"));
		c.add(new JButton("0"));
		c.add(new JButton("."));
		c.add(new JButton("="));
		
		setSize(600,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new calculator(); 
		}
}
