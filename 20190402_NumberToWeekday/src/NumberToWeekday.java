import java.util.*;

public class NumberToWeekday {

	public static void main(String[] args) {
		//���� �Է�
		//���� ��� (1:�� 2:ȭ 3:ȭ ...7:��)
		/*int num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("������");
		case 2: 
			System.out.println("ȭ����");
		case 3: 
			System.out.println("������");
		case 4: 
			System.out.println("�����");
		case 5: 
			System.out.println("�ݿ���");
		case 6: 
			System.out.println("�����");
		case 7: 
			System.out.println("�Ͽ���");
		}*/
		
		String [] weekdays= {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		
		System.out.println("1���� 7���� ������ �ϳ��� �Է��ϼ���.");
		Scanner scanner=new Scanner(System.in);
		int inputNumber=scanner.nextInt();
		
		System.out.println(weekdays[inputNumber-1]);
	}

}
