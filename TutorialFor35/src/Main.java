import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ϴ� ������ �Է��ϼ���(¦���� ��)>>>");
		int num=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<=num;i++) {
			if(i%2==1) continue;
			sum+=i;
		}
		System.out.println(x);
	}

}
