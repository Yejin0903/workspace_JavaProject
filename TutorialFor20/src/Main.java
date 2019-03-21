import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int count=0;        //count는 입력된 정수의 갯수
		int sum=0;          //sum은 합
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하고 종료를 원할 시 0을 입력하시오.");
		
		int n=sc.nextInt();
		while(n!=0) {
			sum+=n;
			count++;
			n=sc.nextInt();
			}
		if(count==0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.println("정수의 개수는"+count+"개이며");
			System.out.println("평균은"+(double)sum/count+"입니다.");
		}
		sc.close();
	}

}
