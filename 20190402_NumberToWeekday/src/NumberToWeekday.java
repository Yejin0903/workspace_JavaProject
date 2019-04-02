import java.util.*;

public class NumberToWeekday {

	public static void main(String[] args) {
		//숫자 입력
		//요일 출력 (1:월 2:화 3:화 ...7:일)
		/*int num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("월요일");
		case 2: 
			System.out.println("화요일");
		case 3: 
			System.out.println("수요일");
		case 4: 
			System.out.println("목요일");
		case 5: 
			System.out.println("금요일");
		case 6: 
			System.out.println("토요일");
		case 7: 
			System.out.println("일요일");
		}*/
		
		String [] weekdays= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		System.out.println("1부터 7까지 숫자중 하나를 입력하세요.");
		Scanner scanner=new Scanner(System.in);
		int inputNumber=scanner.nextInt();
		
		System.out.println(weekdays[inputNumber-1]);
	}

}
