import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�԰� ���� ������ �����Ͻÿ�.");
		System.out.println("1.���  2.ġŲ  3.����  4.�Ľ�Ÿ");
		
		System.out.println("��ȣ�� �����Ͻÿ�.>>>");
		int n=scanner.nextInt();
		switch(n) {
		case 1: System.out.println("����� ��ð� �����ñ���.5�и� ��ٸ�����.");
		break;
		
		case 2: System.out.println("ġŲ�� ��ð� �����ñ���.15�и� ��ٸ�����."); 
		break;
		
		case 3: System.out.println("������ ��ð� �����ñ���.���� �ð��� ���� �ɸ��ϴ�.");
		break;
		
		case 4: System.out.println("�Ľ�Ÿ�� ��ð� �����ñ���.30�� ���� �ɸ��ϴ�.");
		break;
		
		default: System.out.println("����ȿ��� ������.���� ���� ��ȣ�� ���� �ȿ� �����ϴ�.");
		}
		System.out.println();
	}

}
