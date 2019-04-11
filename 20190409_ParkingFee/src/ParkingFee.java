//분을 입력받아
//최초 30분은 2000원.10분당 1000원 추가
//주차요금 출력
import java.util.*;
public class ParkingFee {

	public static void main(String[] args) {
		//최초 30분은 1500원
		//30분이 지나면 10분당 1000원
		//분=분-30,요금+=1500
		//요금+=(분/10)*1000 10분당 1000원
		//분%10!=0 이면, 요금+=1000
		Scanner scanner=new Scanner(System.in);
		System.out.print("주차할 시간을 입력하세요 : ");
		int parkingMin=scanner.nextInt();
		
		int fee=0;
		
		if(parkingMin<=30) {
			fee=1500;
		}else {
			parkingMin=parkingMin-30;
			fee+=1500;
			fee+=(parkingMin%10)*1000;
			if(parkingMin%10!=0) {
				fee+=1000;
			}
		}
		System.out.println("주차요금 : "+fee);
	}
}
