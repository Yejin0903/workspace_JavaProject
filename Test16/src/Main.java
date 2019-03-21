import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오.>>>");
		int n=sc.nextInt();
		System.out.println("배열 크기 : "+ n);
		int arr[]=new int[n];
		int i,j,sum=0;
		for(i=0;i<arr.length;i++) {
			System.out.println("배열에 넣을 수를 입력하시오.");
			arr[i]=sc.nextInt();
		}
		System.out.print("2진수 : ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(i=0;i<arr.length;i++) {
			int temp=1;
			for(j=1;j<=(n-1)-i;j++)
				temp*=2;
			sum+=arr[i]*temp;
				}
		System.out.print("\n10진수 : "+sum);
	}
}
