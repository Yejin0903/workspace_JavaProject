import java.util.Scanner;

public class ForTotal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();  //정수 입력
			sum += n;
			System.out.println("총합은" + sum + "입니다.");
			System.out.println("평균은" + (double)sum/5 + "입니다.");
			scanner.close();
			
		}
		
		
				
				

	}

}
