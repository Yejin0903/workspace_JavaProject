import java.util.*;
public class Nsum {

	public static void main(String[] args) {
		//String���� �Է¹��� ��(�Է��� ���� ���̸� �˾ƾ���)
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		//�� �ڸ����� ���� ������
		nSum(number);
	}

	private static void nSum(String number) {
		int length=number.length();
		int sum=0;
		for(int i=0;i<length;i++) {
			char n=number.charAt(i); //�ѱ��ھ� �����ͼ� ���ڷ� �ٲ���, 0~�ڸ���-1���� �ݺ�
			sum+=n-'0'; //sum�� ������
		}
		//���Ѱ��� ���
		System.out.println(sum);
	}
}
