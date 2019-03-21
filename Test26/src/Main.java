import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하시오.>>>");
		int year=sc.nextInt();
		
		if(year<8 || year>=60)
			System.out.print("무료입니다.");
		else
			System.out.print("5000원 입니다.");
		
	}

}
