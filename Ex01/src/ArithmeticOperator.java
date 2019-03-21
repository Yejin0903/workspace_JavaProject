import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("정수를 입력하세요:");
		int i = scanner.nextInt(); //실행시정수입력
		System.out.println("입력된 i 값은"+i+"입니다.");*/
		
		System.out.println("정수 2개를 입력하세요.");
		int i = scanner.nextInt();
		int u = scanner.nextInt();
		
		System.out.println("두수의 합은" + (i+u) + "입니다.");
		System.out.println("두수의 차는" + (i-u) + "입니다.");
		System.out.println("두수의 곱은" + (i*u) + "입니다.");
		System.out.println("정수 i를 u로 나눈 몫은" + (i/u) + "이며, 나머지는" + (i%u) + "입니다.");

	}

}
