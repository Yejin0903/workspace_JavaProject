//���� �Է¹޾�
//���� 30���� 2000��.10�д� 1000�� �߰�
//������� ���
import java.util.*;
public class ParkingFee {

	public static void main(String[] args) {
		//���� 30���� 1500��
		//30���� ������ 10�д� 1000��
		//��=��-30,���+=1500
		//���+=(��/10)*1000 10�д� 1000��
		//��%10!=0 �̸�, ���+=1000
		Scanner scanner=new Scanner(System.in);
		System.out.print("������ �ð��� �Է��ϼ��� : ");
		int parkingMin=scanner.nextInt();
		
		int fee=0;
		
		if(parkingMin<=30) {
			fee=1500;
		}else {
			parkingMin=parkingMin-30;
			fee+=1500;
			fee+=(parkingMin%10)*1000;
			if(parkingMin%10!=0) {
				fee+=1000;
			}
		}
		System.out.println("������� : "+fee);
	}
}
