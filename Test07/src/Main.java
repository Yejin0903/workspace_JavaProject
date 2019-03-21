import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==n)
				System.out.print(i);
			else if(n%i==0)
				System.out.print(i+" ");
		}

}
}
