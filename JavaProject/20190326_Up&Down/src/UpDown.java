import java.util.*;
public class UpDown {
	//1~100까지 숫자 중 하나를 생각한다. 상대방이 임의의 숫자를 말하고,
	//내가 생각한 숫자가 상대방이 말한 숫자보다 높으면 Up을 낮으면 Down을 말한다. 같으면 게임은 끝난다.
	//컴퓨터가 생각하고 내가 맞추는 것	
	public static void main(String[] args) {
		Random random=new Random();
		int rNumber=random.nextInt(100+1); //0~99
		System.out.println("1~100까지중 임의의 숫자를 컴퓨터가 생각했습니다. 맞춰보세요.");
		Scanner scanner=new Scanner(System.in);
		int count=1;
		
		while(true) {
		System.out.print("숫자 입력 : ");
		int uNumber=scanner.nextInt();
		
		if(rNumber!=uNumber&&rNumber>uNumber) {
			System.out.println("틀렸습니다.컴퓨터가 고른 숫자가 더 큽니다.");
			count++;
		}
		else if(rNumber!=uNumber&&rNumber<uNumber) {
				System.out.println("틀렸습니다. 컴퓨터가 고른 숫자가 더 작습니다. ");
				count++;
		}
		else if(rNumber==uNumber) {
			System.out.println("정답입니다."+count+"번 만에 맞추셨습니다. ");
			
			System.exit(0);
		}
	}

}
}
