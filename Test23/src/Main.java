import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�.>>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("ū ����>>>");
		
		if(a>b) {
			if(a<c) {
				System.out.print(c);
			}
			else
				System.out.print(a);
		}
		else if(b<c) {
			System.out.print(c);
		}
			else
				System.out.print(b);
	}

}