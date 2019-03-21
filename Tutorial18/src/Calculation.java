import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두수를 입력하세요(예 3 7) :");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		System.out.print("연산자를 입력하세요(+,-,*,/,%): ");
		String opcode = scanner.next();
		switch(opcode) {
		case "+": // 더하기 연산
			System.out.println("두 수의 합:" + i1 + " + " + i2 + "=" + (i1+i2)+"입니다");
			break;
		case "-": // 빼기 연산
			System.out.println("두 수의 차:" + i1 + " - " + i2 + "=" + (i1-i2)+"입니다");
			break;
		case "*":  // 곱하기 연산 
			System.out.println("두 수의 곱:" + i1 + " * " + i2 + "=" + (i1*i2)+"입니다");
			break;
		case "/": // 나누기 연산
			System.out.println("두 수의 몫:" + i1 + " / " + i2 + "=" + (i1/i2)+"입니다");
			break;
		case "%": // 나머지 연산
			System.out.println("나머지값:" + i1 + " % " + i2 + "=" + (i1%i2)+"입니다");
			break;
			default: // 잘 못된 입력입니다
				System.out.println("잘 못된 입략입니다.");
			
		}
		scanner.close();
	}

}
