import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.print("***���� �˾ƺ���***\n�⵵�� �Է��ϼ���:");
		int year=in.nextInt();
		boolean yoon=false;
		if(year%400==0)
			yoon=true;
		else if(year%100==0)
			yoon=false;
		else if(year%4==0)
			yoon=true;
		System.out.print("\t"+year+"����");
		if(yoon)
			System.out.println("�����̴�");
		else
			System.out.println("����ƴϴ�");
	}

}
}
