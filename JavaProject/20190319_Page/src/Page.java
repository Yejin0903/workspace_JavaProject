import java.util.*;
public class Page {

	public static void main(String[] args) {
		
		/*int nPerPage=7;
		int result=331;
		int last=result/nPerPage;
		if(result%nPerPage==0) {
			last=result/nPerPage=1;
		}
		System.out.println(last + "�������� �ʿ��մϴ�.");*/
		
	
		//����� �Է����� ��ü �������� �Է¹޾� ����ؼ� ���
		/*int nPerPage=7;
		System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
		Scanner scanner=new Scanner(System.in);
		int result=scanner.nextInt();
		int last=result/nPerPage;
		if(result%nPerPage==0) {
			last=result/nPerPage;
		}
		System.out.println(last + "�������� �ʿ��մϴ�.");


	}*/
		
		int nPerPage=7;
		Scanner scanner=new Scanner(System.in); 
		
		while(true) {
			//input
			System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
			String inputString=scanner.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("����");
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
		System.out.println(last + "�������� �ʿ��մϴ�.");
	}

}
}
