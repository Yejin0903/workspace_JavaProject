import java.util.Scanner;

public class ForTotal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();  //���� �Է�
			sum += n;
			System.out.println("������" + sum + "�Դϴ�.");
			System.out.println("�����" + (double)sum/5 + "�Դϴ�.");
			scanner.close();
			
		}
		
		
				
				

	}

}
