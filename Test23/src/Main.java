import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오.>>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("큰 수는>>>");
		
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
