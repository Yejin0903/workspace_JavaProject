import java.util.*;
public class StudentNumber {

	public static void main(String[] args) {
		//�й� �Է�
		System.out.print("�й��� �Է��ϼ��� : ");
		Scanner scanner=new Scanner(System.in);
		String stNum=scanner.nextLine();
		String grade=stNum.substring(0,1);
		//char grade=stNum.charAt(0);
		String classroom=stNum.substring(1,2);
		//�а� ���
		if((grade.equals("1")||grade.equals("2"))) { //&&���� Ʋ��
			//�г��� 1,2�̸�
			if((classroom.equals("1")||classroom.equals("2"))) {
				//���� 1,2�̸� "���̵�����Ʈ�����"
				System.out.println("���̵�����Ʈ�����");
			}
			else if((classroom.equals("3")||classroom.equals("4"))) {
				//���� 3,4�̸� "���̵�����ַ�ǰ�"
				System.out.println("���̵�����ַ�ǰ�");
			}
			else if((classroom.equals("5")||classroom.equals("6"))) {
				//���� 5,6�̸� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
		}
		//�г��� 3�̸�
		else if(grade.equals("3")) {
			if((classroom.equals("1")||classroom.equals("2"))) {
				//���� 1,2�̸� "���ͷ�Ƽ��̵���"
				System.out.println("���ͷ�Ƽ��̵���");
			}
			else if((classroom.equals("3")||classroom.equals("4"))) {
				//���� 3,4�̸� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
			else if((classroom.equals("5")||classroom.equals("6"))) {
				//���� 5,6�̸� "���̵��ַ�ǰ�"
				System.out.println("���̵��ַ�ǰ�");
			}
		}
	}
}
