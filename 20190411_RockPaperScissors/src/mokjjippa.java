import java.util.Random;
import java.util.Scanner;
public class mokjjippa {

	public static void main(String[] args) {
		boolean winPlayer=false;
		boolean winner=false;
		String[] pae= {"��","��","��"};
		Scanner scanner=new Scanner(System.in);
		//������� �Է��� �޴´�(1:�� 2:�� 3:�� 0:��)
		while(true) {
		System.out.println("������� �Է��� ������(1:�� 2:�� 3:�� 0:��)");
		int per=scanner.nextInt();
		if(per==0) {
			break;
		}
		//��ǻ���� �и� ������
		int c=makeComputer();
		//����ڿ� ��ǻ���� �и� ������
		int result=compare(per,c);
		//����� �������
		System.out.println("�����:"+pae[per-1]+"\t��ǻ��:"+pae[per-1]);
		if(result==-1) {
			winPlayer=false;
			winner=true;
		}else if(result==0) {
			if(winner==true) {
				if(winPlayer==true) {
					System.out.println("�̰��.");
				}else {
					System.out.println("����.");
				}
			}else {
				
			}
			//ó�� ���� �ٽ� ����������
			//���а� ���������� ���� ���� �� ���� ���ڰ� ��,��� ���
			System.out.println("����.");
		}else {
			//���� ����� ������ �־����
			winPlayer=true;
			winner=true;
		}
	  }
	}
	private static int compare(int per, int c) {
		if((per==1&&c==2)||(per==2&&c==3)||(per==3&&c==1)) { //-1 : ����ڰ� ��
			return -1;
		}else if(per==c) {
		//else if((per==1&&c==1)||(per==2&&c==2)||(per==3&&c==3)) { //0 : ���
			return 0;
		}else { //1 : ����ڰ� �̱�
			return 1;
		}
	}
	private static int makeComputer() {
		Random random=new Random();
		int c=random.nextInt(3-1+1)+1; //1~3���� ������ ��
		return c;
	}

}

