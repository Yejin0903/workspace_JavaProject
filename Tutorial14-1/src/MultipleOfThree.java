import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�");
		int number = in.nextInt();
		
		if (number % 2 == 0)
			System.out.println("¦�� �Դϴ�.");
		else
			System.out.println("Ȧ�� �Դϴ�.");
		in.close();
		

	}

}
