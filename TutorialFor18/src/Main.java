import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("10개의 정수를 입력하시오.");
		for(int i=1;i<=10;i++) {
			System.out.println("정수를 입력하시오.");
			a=sc.nextInt();
			if(a%3==0) {
				sum+=a;
				}
			}
		System.out.println("3의 배수의 합은"+sum+"입니다");
		
	}

}
