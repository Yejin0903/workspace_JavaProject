import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�μ��� �Է��ϼ���(�� 3 7) :");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/,%): ");
		String opcode = scanner.next();
		switch(opcode) {
		case "+": // ���ϱ� ����
			System.out.println("�� ���� ��:" + i1 + " + " + i2 + "=" + (i1+i2)+"�Դϴ�");
			break;
		case "-": // ���� ����
			System.out.println("�� ���� ��:" + i1 + " - " + i2 + "=" + (i1-i2)+"�Դϴ�");
			break;
		case "*":  // ���ϱ� ���� 
			System.out.println("�� ���� ��:" + i1 + " * " + i2 + "=" + (i1*i2)+"�Դϴ�");
			break;
		case "/": // ������ ����
			System.out.println("�� ���� ��:" + i1 + " / " + i2 + "=" + (i1/i2)+"�Դϴ�");
			break;
		case "%": // ������ ����
			System.out.println("��������:" + i1 + " % " + i2 + "=" + (i1%i2)+"�Դϴ�");
			break;
			default: // �� ���� �Է��Դϴ�
				System.out.println("�� ���� �Է��Դϴ�.");
			
		}
		scanner.close();
	}

}
