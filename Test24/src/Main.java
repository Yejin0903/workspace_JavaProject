import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.>>>");
		int n=sc.nextInt();
		while(n != 999) {
		if(n>0) {
			System.out.println(n+"은 양수입니다.");
		}
			else if(n==0)
				System.out.println(n+"은 0입니다.");
			else 
				System.out.println(n+"는 음수입니다.");
		
		System.out.println("정수를 입력하세요.>>>");
		n=sc.nextInt();
	}

		if(n==999) {
			System.out.println("999는 양수입니다.프로그램을 종료합니다.");
		}
	}
}
