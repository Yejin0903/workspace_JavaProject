import java.util.Random;
import java.util.*;

public class UpDownBot {
	//사람이 1~100까지 숫자 중 하나를 생각한다. 컴퓨터는 임의의 숫자를 말한다.
	//사람이 생각한 숫자가 컴퓨터가 생각한 숫자보다 크면 Up을, 작으면 Down을 알려준다. 
	//컴퓨터는 계속해서 추측한다. 같으면 “축하합니다.”출력
	public static void main(String[] args) {
		Random random=new Random();
		
		//사용자가 생각하는 숫자를 입력
		System.out.print("1~100까지 중 임의의 숫자를 생각하세요 : ");
		Scanner scanner=new Scanner(System.in);
		int uNum=scanner.nextInt();
		int count=1;
		
		
		
		
		while(true) {
		int cNum=random.nextInt(100+1);//0~99
		
		if(uNum==cNum) {
			System.out.println("컴퓨터가 생각한 수 >> "+cNum);
			System.out.println("정답입니다."+count+"번 만에 맞추셨습니다.");
			break;
			}
		if(uNum!=cNum&&uNum>cNum) {
			System.out.println("컴퓨터가 생각한 수 >> "+cNum);
			System.out.println("틀렸습니다. 제가 생각한 숫자가 더 큽니다. ");
			count++;
		}
		else if(uNum!=cNum&&uNum<cNum) {
			System.out.println("컴퓨터가 생각한 수 >> "+cNum);
			System.out.println("틀렸습니다. 제가 생각한 숫자가 더 작습니다.");
			count++;
		}
		
	}

}
}
