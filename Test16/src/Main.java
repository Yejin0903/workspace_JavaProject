import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ�.>>>");
		int n=sc.nextInt();
		System.out.println("�迭 ũ�� : "+ n);
		int arr[]=new int[n];
		int i,j,sum=0;
		for(i=0;i<arr.length;i++) {
			System.out.println("�迭�� ���� ���� �Է��Ͻÿ�.");
			arr[i]=sc.nextInt();
		}
		System.out.print("2���� : ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(i=0;i<arr.length;i++) {
			int temp=1;
			for(j=1;j<=(n-1)-i;j++)
				temp*=2;
			sum+=arr[i]*temp;
				}
		System.out.print("\n10���� : "+sum);
	}
}
