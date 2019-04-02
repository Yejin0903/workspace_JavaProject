import java.util.Random;
import java.util.Scanner;

public class UpDownBot_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=1;
		int end=100;
		
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		while(true) {
		int guess=random.nextInt(end-start+1)+start;
     	System.out.println(guess+"입니까? (1.정답  2.Up 3.Down)");
		int answer=scanner.nextInt();
		
		if(answer==1) {
			System.out.println("정답입니다.");
			break;
		}
		else if(answer==1) {
			start=guess+1;
		}
		else if(answer==3) {
			end=guess-1;
		}
		
	}

   }
}
