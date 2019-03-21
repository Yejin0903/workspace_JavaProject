import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오(0~100): ");
		int score = scanner.nextInt(); // 점수 읽기
		if(score >= 90) //score가 90 이상
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'c';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
		

	}

}
