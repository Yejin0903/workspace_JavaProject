import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("10���� ������ �Է��Ͻÿ�.");
		for(int i=1;i<=10;i++) {
			System.out.println("������ �Է��Ͻÿ�.");
			a=sc.nextInt();
			if(a%3==0) {
				sum+=a;
				}
			}
		System.out.println("3�� ����� ����"+sum+"�Դϴ�");
		
	}

}
