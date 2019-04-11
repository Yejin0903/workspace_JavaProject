import java.util.*;
public class Nsum {

	public static void main(String[] args) {
		//String으로 입력받을 것(입력한 것의 길이를 알아야함)
		System.out.print("원하는 숫자를 입력하세요 : ");
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		//각 자릿수의 수를 더하자
		nSum(number);
	}

	private static void nSum(String number) {
		int length=number.length();
		int sum=0;
		for(int i=0;i<length;i++) {
			char n=number.charAt(i); //한글자씩 가져와서 숫자로 바꾸자, 0~자릿수-1까지 반복
			sum+=n-'0'; //sum을 더하자
		}
		//더한값을 출력
		System.out.println(sum);
	}
}
