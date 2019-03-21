import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.print("***윤년 알아보기***\n년도를 입력하세요:");
		int year=in.nextInt();
		boolean yoon=false;
		if(year%400==0)
			yoon=true;
		else if(year%100==0)
			yoon=false;
		else if(year%4==0)
			yoon=true;
		System.out.print("\t"+year+"년은");
		if(yoon)
			System.out.println("윤년이다");
		else
			System.out.println("윤년아니다");
	}

}
}
