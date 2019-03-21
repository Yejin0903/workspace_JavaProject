import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int intArray[]=new int[5]; //배열의 선언과 생성
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하세요>>");
		for(int i=0;i<intArray.length;i++) {
			int n=scanner.nextInt();
			sum+=n;
		}
		System.out.println("합계는"+sum);
		System.out.println("평균은 "+(float)(sum/intArray.length));
		
	}

}
