import java.util.*;
public class Echo {
//����ڰ� �Է��� ���� �״�� �����ϱ�
//�Է�,��� ���ѹݺ�
//exit�ϸ� ������
	public static void main(String[] args) {
		//�ݺ�
		while(true) { 
		System.out.println("���ϴ� ���� �ƹ��ų� �Է��ϼ��� :");
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		
		if(text.equals("exit")) {
			System.out.println("����");
			break;
		}
		System.out.println(text);

		}
	}

}
