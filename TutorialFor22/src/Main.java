import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int intArray[]=new int[5]; //�迭�� ����� ����
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print(intArray.length+"���� ������ �Է��ϼ���>>");
		for(int i=0;i<intArray.length;i++) {
			int n=scanner.nextInt();
			sum+=n;
		}
		System.out.println("�հ��"+sum);
		System.out.println("����� "+(float)(sum/intArray.length));
		
	}

}
