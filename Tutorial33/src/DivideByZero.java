import java.util.Scanner;

public class DivideByZero {

	public DivideByZero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt();
		System.out.print("�������� Ȯ���Ͻÿ�:");
		divisor = scanner.nextInt();
		System.out.println(dividend+"��" +divisor + "�� ������ ����" + dividend/divisor +"�Դϴ�.");
		scanner.close();

	}

}
