import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		String[] pae= {"가위","바위","보"};
		Scanner scanner=new Scanner(System.in);
		//사용자의 입력을 받는다(1:가위 2:바위 3:보 0:끝)
		while(true) {
		System.out.println("사용자의 입력을 말하자(1:가위 2:바위 3:보 0:끝)");
		int per=scanner.nextInt();
		if(per==0) {
			break;
		}
		//컴퓨터의 패를 구하자
		int c=makeComputer();
		//사용자와 컴퓨터의 패를 비교하자
		int result=compare(per,c);
		//결과를 출력하자
		System.out.println("사용자:"+pae[per-1]+"\t컴퓨터:"+pae[per-1]);
		if(result==-1) {
			System.out.println("졌다.");
		}else if(result==0) {
			System.out.println("비겼다.");
		}else {
			System.out.println("이겼다.");
		}
	  }
	}
	private static int compare(int per, int c) {
		if((per==1&&c==2)||(per==2&&c==3)||(per==3&&c==1)) { //-1 : 사용자가 짐
			return -1;
		}else if(per==c) {
		//else if((per==1&&c==1)||(per==2&&c==2)||(per==3&&c==3)) { //0 : 비김
			return 0;
		}else { //1 : 사용자가 이김
			return 1;
		}
	}
	private static int makeComputer() {
		Random random=new Random();
		int c=random.nextInt(3-1+1)+1; //1~3까지 임의의 수
		return c;
	}

}
