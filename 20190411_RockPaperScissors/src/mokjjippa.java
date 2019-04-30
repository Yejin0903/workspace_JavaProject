import java.util.Random;
import java.util.Scanner;
public class mokjjippa {

	public static void main(String[] args) {
		boolean winPlayer=false;
		boolean winner=false;
		String[] pae= {"찌","묵","빠"};
		Scanner scanner=new Scanner(System.in);
		//사용자의 입력을 받는다(1:묵 2:찌 3:빠 0:끝)
		while(true) {
		System.out.println("사용자의 입력을 말하자(1:찌 2:묵 3:빠 0:끝)");
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
			winPlayer=false;
			winner=true;
		}else if(result==0) {
			if(winner==true) {
				if(winPlayer==true) {
					System.out.println("이겼다.");
				}else {
					System.out.println("졌다.");
				}
			}else {
				
			}
			//처음 비기면 다시 가위바위보
			//승패가 갈린다음에 비기면 게임 끝 이전 승자가 승,결과 출력
			System.out.println("비겼다.");
		}else {
			//이전 결과를 가지고 있어야함
			winPlayer=true;
			winner=true;
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

