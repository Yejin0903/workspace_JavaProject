import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int count=0;        //count�� �Էµ� ������ ����
		int sum=0;          //sum�� ��
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� ���Ḧ ���� �� 0�� �Է��Ͻÿ�.");
		
		int n=sc.nextInt();
		while(n!=0) {
			sum+=n;
			count++;
			n=sc.nextInt();
			}
		if(count==0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("������ ������"+count+"���̸�");
			System.out.println("�����"+(double)sum/count+"�Դϴ�.");
		}
		sc.close();
	}

}
