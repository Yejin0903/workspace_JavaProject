import java.util.*;
public class UpDown {
	//1~100���� ���� �� �ϳ��� �����Ѵ�. ������ ������ ���ڸ� ���ϰ�,
	//���� ������ ���ڰ� ������ ���� ���ں��� ������ Up�� ������ Down�� ���Ѵ�. ������ ������ ������.
	//��ǻ�Ͱ� �����ϰ� ���� ���ߴ� ��	
	public static void main(String[] args) {
		Random random=new Random();
		int rNumber=random.nextInt(100+1); //0~99
		System.out.println("1~100������ ������ ���ڸ� ��ǻ�Ͱ� �����߽��ϴ�. ���纸����.");
		Scanner scanner=new Scanner(System.in);
		int count=1;
		
		while(true) {
		System.out.print("���� �Է� : ");
		int uNumber=scanner.nextInt();
		
		if(rNumber!=uNumber&&rNumber>uNumber) {
			System.out.println("Ʋ�Ƚ��ϴ�.��ǻ�Ͱ� �� ���ڰ� �� Ů�ϴ�.");
			count++;
		}
		else if(rNumber!=uNumber&&rNumber<uNumber) {
				System.out.println("Ʋ�Ƚ��ϴ�. ��ǻ�Ͱ� �� ���ڰ� �� �۽��ϴ�. ");
				count++;
		}
		else if(rNumber==uNumber) {
			System.out.println("�����Դϴ�."+count+"�� ���� ���߼̽��ϴ�. ");
			
			System.exit(0);
		}
	}

}
}
