
public class Main {
	
	public static void main(String[] args) {
		double score[][]= {{89,92}, //1�г� 1,2�б� ���
				{94,96},  //2�г� 1,2�б� ���
				{95,92}};  //3�г� 1,2�б� ���
				
				double sum=0;
				for(int year=0;year<score.length;year++) { //�� �г⺰�� �ݺ�
					for(int term=0;term<score[year].length;term++) {
						sum+=score[year][term];//��ü ���� ��
						
						int n=score.length; //�迭�� �� ����,4
						int m=score[0].length; //�迭�� �� ����,2
						System.out.println("3�� ��ü ���� �����"+sum/(n*m));
					}
					
					}
	}

}
