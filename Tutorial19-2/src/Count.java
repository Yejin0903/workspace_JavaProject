import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 더할 숫자를 입력하세요.");
		int a = scanner.nextInt();
		int sum=0;
		for(int i=1; i <=a; i++) {
			System.out.print(i);
			sum+=i;
			if(i<=(a-1))
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
					
		}
				
	}

}
