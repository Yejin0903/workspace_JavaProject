
public class Main {
	
	public static void main(String[] args) {
		int [] n= {100,200,300,400,500};
		String names[]= {"ȫ�浿","��","�̼���","�������","����","�Ż��Ӵ�"};
		
		int sum=0;
		//�Ʒ� for-each���� k�� n[0],n[1],...,n[4]
		for(int k:n) {
			System.out.println(k+" ");
			sum+=k;
		}
		System.out.println("����"+sum);
		
		//�Ʒ� for-each�� s�� names[0],names[1],...,names[5]�� �ݺ�
		for(String s:names) {
			System.out.print(s+" ");
			System.out.println();
		}
	}
}
