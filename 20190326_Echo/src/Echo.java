import java.util.*;
public class Echo {
//사용자가 입력한 것을 그대로 따라하기
//입력,출력 무한반복
//exit하면 끝내기
	public static void main(String[] args) {
		while(true) {
		System.out.println("원하는 것을 아무거나 입력하세요 :");
		Scanner scanner=new Scanner(System.in);
		String english=scanner.nextLine();
		
		if(english.equals("exit")) {
			System.out.println("종료");
			break;
		}
		System.out.println(english);

		}
	}

}
