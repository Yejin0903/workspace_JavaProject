import java.util.Random;
import java.util.*;

public class UpDownBot {
	//����� 1~100���� ���� �� �ϳ��� �����Ѵ�. ��ǻ�ʹ� ������ ���ڸ� ���Ѵ�.
	//����� ������ ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� Up��, ������ Down�� �˷��ش�. 
	//��ǻ�ʹ� ����ؼ� �����Ѵ�. ������ �������մϴ�.�����
	public static void main(String[] args) {
		Random random=new Random();
		
		//����ڰ� �����ϴ� ���ڸ� �Է�
		System.out.print("1~100���� �� ������ ���ڸ� �����ϼ��� : ");
		Scanner scanner=new Scanner(System.in);
		int uNum=scanner.nextInt();
		int count=1;
		
		
		
		
		while(true) {
		int cNum=random.nextInt(100+1);//0~99
		
		if(uNum==cNum) {
			System.out.println("��ǻ�Ͱ� ������ �� >> "+cNum);
			System.out.println("�����Դϴ�."+count+"�� ���� ���߼̽��ϴ�.");
			break;
			}
		if(uNum!=cNum&&uNum>cNum) {
			System.out.println("��ǻ�Ͱ� ������ �� >> "+cNum);
			System.out.println("Ʋ�Ƚ��ϴ�. ���� ������ ���ڰ� �� Ů�ϴ�. ");
			count++;
		}
		else if(uNum!=cNum&&uNum<cNum) {
			System.out.println("��ǻ�Ͱ� ������ �� >> "+cNum);
			System.out.println("Ʋ�Ƚ��ϴ�. ���� ������ ���ڰ� �� �۽��ϴ�.");
			count++;
		}
		
	}

}
}
