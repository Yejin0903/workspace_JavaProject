import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하시오");
		int number = in.nextInt();
		
		if (number % 2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		in.close();
		

	}

}
