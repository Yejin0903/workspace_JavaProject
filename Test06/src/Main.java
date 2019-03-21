import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int n=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++) 
			factorial*=i;
			
			System.out.print(n+"!은"+factorial+"입니다.");
		
	}

}
