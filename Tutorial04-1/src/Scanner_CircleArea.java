import java.util.Scanner;

public class Scanner_CircleArea {

	public static void main(String[] args) {
		System.out.println("�������� ���̸� �Է��Ͻÿ�.");
		
		Scanner scanner = new Scanner(System.in);
		final double PI=3.14;
		double radius= scanner.nextDouble();
		System.out.println("�� ���� �������� ���̴�"+radius+"�Դϴ�.");
		System.out.println("���� ����=" + radius*radius*PI);
	}
		
		

	

}
