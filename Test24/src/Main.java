import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.>>>");
		int n=sc.nextInt();
		while(n != 999) {
		if(n>0) {
			System.out.println(n+"�� ����Դϴ�.");
		}
			else if(n==0)
				System.out.println(n+"�� 0�Դϴ�.");
			else 
				System.out.println(n+"�� �����Դϴ�.");
		
		System.out.println("������ �Է��ϼ���.>>>");
		n=sc.nextInt();
	}

		if(n==999) {
			System.out.println("999�� ����Դϴ�.���α׷��� �����մϴ�.");
		}
	}
}
