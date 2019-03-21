import java.util.Scanner;

public class Maun {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("100미만의 정수를 입력하세요.");
		int n;
		while(true) {
			n=sc.nextInt();
			if(n>=100) {
				System.out.println("잘못 입력하셨습니다.100미만의 정수를 입력하시오.");
			}
			else
				break;
			}
		int b=0;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=b++;
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		}
		
	}


