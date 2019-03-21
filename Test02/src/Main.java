import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("먹고 싶은 음식을 선택하시오.");
		System.out.println("1.라면  2.치킨  3.피자  4.파스타");
		
		System.out.println("번호를 선택하시오.>>>");
		int n=scanner.nextInt();
		switch(n) {
		case 1: System.out.println("라면을 드시고 싶으시군요.5분만 기다리세요.");
		break;
		
		case 2: System.out.println("치킨을 드시고 싶으시군요.15분만 기다리세요."); 
		break;
		
		case 3: System.out.println("피자을 드시고 싶으시군요.조금 시간이 많이 걸립니다.");
		break;
		
		case 4: System.out.println("파스타을 드시고 싶으시군요.30분 정도 걸립니다.");
		break;
		
		default: System.out.println("보기안에서 고르세요.현재 고르신 번호는 보기 안에 없습니다.");
		}
		System.out.println();
	}

}
