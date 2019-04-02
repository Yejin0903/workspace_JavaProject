import java.util.*;
public class Page {

	public static void main(String[] args) {
		
		/*int nPerPage=7;
		int result=331;
		int last=result/nPerPage;
		if(result%nPerPage==0) {
			last=result/nPerPage=1;
		}
		System.out.println(last + "페이지가 필요합니다.");*/
		
	
		//사용자 입력으로 전체 페이지를 입력받아 계산해서 출력
		/*int nPerPage=7;
		System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.)");
		Scanner scanner=new Scanner(System.in);
		int result=scanner.nextInt();
		int last=result/nPerPage;
		if(result%nPerPage==0) {
			last=result/nPerPage;
		}
		System.out.println(last + "페이지가 필요합니다.");


	}*/
		
		int nPerPage=7;
		Scanner scanner=new Scanner(System.in); 
		
		while(true) {
			//input
			System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.)");
			String inputString=scanner.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("종료");
				break;
			}
			
		//String->int
		int result=Integer.parseInt(inputString);
		//calculate page
		int last=result/nPerPage;
			if(result%nPerPage!=0) {
					last=result/nPerPage+1;
		}
		//output
		System.out.println(last + "페이지가 필요합니다.");
	}

}
}
