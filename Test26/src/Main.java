import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�.>>>");
		int year=sc.nextInt();
		
		if(year<8 || year>=60)
			System.out.print("�����Դϴ�.");
		else
			System.out.print("5000�� �Դϴ�.");
		
	}

}
