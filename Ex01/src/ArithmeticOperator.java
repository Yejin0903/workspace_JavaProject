import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("������ �Է��ϼ���:");
		int i = scanner.nextInt(); //����������Է�
		System.out.println("�Էµ� i ����"+i+"�Դϴ�.");*/
		
		System.out.println("���� 2���� �Է��ϼ���.");
		int i = scanner.nextInt();
		int u = scanner.nextInt();
		
		System.out.println("�μ��� ����" + (i+u) + "�Դϴ�.");
		System.out.println("�μ��� ����" + (i-u) + "�Դϴ�.");
		System.out.println("�μ��� ����" + (i*u) + "�Դϴ�.");
		System.out.println("���� i�� u�� ���� ����" + (i/u) + "�̸�, ��������" + (i%u) + "�Դϴ�.");

	}

}
