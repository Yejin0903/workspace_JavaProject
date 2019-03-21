import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int n=scanner.nextInt();
		int sum=0;
		System.out.print("합한 값 ");
		for(int i=5;i<=n;i+=5) {
			if(i%10==0) { 
				continue;
			}
				else if(i%5==0) {
					sum+=i;
					System.out.print(i+" ");
				}
				
			}
		System.out.println(" ");
		System.out.print("합계는  "+sum);
	}

}