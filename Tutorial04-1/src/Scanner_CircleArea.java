import java.util.Scanner;

public class Scanner_CircleArea {

	public static void main(String[] args) {
		System.out.println("반지름의 길이를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		final double PI=3.14;
		double radius= scanner.nextDouble();
		System.out.println("이 원의 반지름의 길이는"+radius+"입니다.");
		System.out.println("원의 면적=" + radius*radius*PI);
	}
		
		

	

}
