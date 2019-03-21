import java.util.ArrayList;
import java.util.Scanner;


public class WhitePages {
	
	ArrayList<WhitePagesObj> whitePageList = new ArrayList<WhitePagesObj>();
	
	//생성자
	public WhitePages() {
		whitePageList.add(new WhitePagesObj("김종현", "010-1111-1111"));
        whitePageList.add(new WhitePagesObj("곽영민", "010-2222-2222"));
        whitePageList.add(new WhitePagesObj("강동호", "010-3333-3333"));
        whitePageList.add(new WhitePagesObj("황민현", "010-4444-4444"));
        whitePageList.add(new WhitePagesObj("최민기", "010-5555-5555"));
        whitePageList.add(new WhitePagesObj("김남준", "010-6666-6666"));
        whitePageList.add(new WhitePagesObj("차은우", "010-7777-7777"));
        whitePageList.add(new WhitePagesObj("윤산하", "010-8888-8888"));
	}
	//전화번호 출력 메서드
	public void showList() {
		 System.out.println("\n============ 전화번호부   ===========");
	        System.out.println("=======================총 "+whitePageList.size()+"명");
	        for(WhitePagesObj item : whitePageList ){
	            System.out.println(item);
	        }
	        System.out.println("==========================END");
	}
	
	public boolean addWhitePage(){ 
	       
        Scanner scn = new Scanner(System.in);
        System.out.print("이름을 입력해주세요:");
        String name = scn.nextLine();
        System.out.print("전화번호를 입력해주세요:");
        String teleNum = scn.nextLine();
       
        //System.out.println((whitePageList.contains(teleNum)));
        boolean booTeleChk = false;
        //전화번호 중복체크
        for(WhitePagesObj item : whitePageList){  //리스트에 있는 항목을 하나씩 가져옴
            if((item.getTeleNum().equals(teleNum))){ //전화번호 비교
                booTeleChk = true; //중복값이 있으면 다시 입력을 받습니다.
                System.out.println("입력하신 전화번호 [ "+ item.getTeleNum() + " ] 는 이미 존재하는 전화번호입니다.");
                System.out.println("해당 정보를 다시 입력해주세요 =>");
                break;
            }
        }
       
        if(!booTeleChk) whitePageList.add(new WhitePagesObj(name, teleNum));
       
        return booTeleChk;
    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		WhitePages whitepage = new WhitePages();
		
		//메뉴 반복
		while(true) {
			Scanner scn = new Scanner(System.in);
			System.out.println();
            System.out.println("======White Pages======");
            System.out.println("1. All list print ");
            System.out.println("2. White Pages Input ");
            System.out.println("3. End White Pages   ");
            System.out.println("=======================");
            System.out.print("메뉴를 선택해주세요 :");
            int menuNum = scn.nextInt();
            
            
            switch (menuNum) {
            case 1:
                // 전화번호 리스트 보기 메서드 호출
                whitepage.showList();
               // System.out.println(" 계속 하려면 아무 키나 누르시오.");
                break;
            case 2:
                // 전화번호 입력하기 메서드 호출
               
                while(whitepage.addWhitePage()){ }; //전화번호 중복 안되면 반복문 나오기
                System.out.println("SUCCESS!!");
               
                break;
            case 3:
                System.out.println("End program");
                System.exit(0); //정상 종료 처리
                break;
            }//switch end
            
         }//while end
		
		}//main end
	}
