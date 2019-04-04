import java.util.*;
public class StudentNumber {

	public static void main(String[] args) {
		//학번 입력
		System.out.print("학번을 입력하세요 : ");
		Scanner scanner=new Scanner(System.in);
		String stNum=scanner.nextLine();
		String grade=stNum.substring(0,1);
		//char grade=stNum.charAt(0);
		String classroom=stNum.substring(1,2);
		//학과 출력
		if((grade.equals("1")||grade.equals("2"))) { //&&쓰면 틀림
			//학년이 1,2이면
			if((classroom.equals("1")||classroom.equals("2"))) {
				//반이 1,2이면 "뉴미디어소프트웨어과"
				System.out.println("뉴미디어소프트웨어과");
			}
			else if((classroom.equals("3")||classroom.equals("4"))) {
				//반이 3,4이면 "뉴미디어웹솔루션과"
				System.out.println("뉴미디어웹솔루션과");
			}
			else if((classroom.equals("5")||classroom.equals("6"))) {
				//반이 5,6이면 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
			}
		}
		//학년이 3이면
		else if(grade.equals("3")) {
			if((classroom.equals("1")||classroom.equals("2"))) {
				//반이 1,2이면 "인터랙티브미디어과"
				System.out.println("인터랙티브미디어과");
			}
			else if((classroom.equals("3")||classroom.equals("4"))) {
				//반이 3,4이면 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
			}
			else if((classroom.equals("5")||classroom.equals("6"))) {
				//반이 5,6이면 "뉴미디어솔루션과"
				System.out.println("뉴미디어솔루션과");
			}
		}
	}
}
