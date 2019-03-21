import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int[] b=new int[20];
		int n,a=0,i;
		System.out.print("10진수 : ");
		n=sc.nextInt();
		while(n!=0) {
			b[a]=n%2;
			a++;
			n=n/2;
		}	
		System.out.print("2진수 : ");
		for(i=a-1;i>=0;i--)
			System.out.print(b[i]+" ");
		
	}

}
