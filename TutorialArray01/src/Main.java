import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i,j,m=0;
		Scanner in=new Scanner(System.in);
		int[][] n=new int[4][6];
		
		for(i=0;i<4;i++)     //��ȣ����
			for(j=0;j<1;j++) 
				n[i][j]=++m;
		
		System.out.println("����,����,������ ������ �Է��Ͻÿ�>>>");		
		for(i=0;i<4;i++)
			for(j=0;j<1;j++) {
				n[i][j]=in.nextInt();
				n[i][4]+=n[i][j];
				
				} System.out.println();
	for(i=0;i<4;i++)     //���
		n[i][5]=n[i][4]/3;
	System.out.println();

	System.out.println("��ȣ ���� ���� ���� ���� ���");
	System.out.println("===========================================");
	for(i=0;i<4;i++) {
		//System.out.println(n[i][0]+"	");
		for(j=1;j<6;j++) {
			System.out.print(n[i][j]+"\t")i;
		}
		System.out.println();
	}
	}
}



