import java.util.*;
public class Baseball {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//1~9���� ���ڸ� ���ڸ� �Է�
		//1~9���� �������� 3�� �̱�, �� ��¾���
		String c=makeComputer();
		
		//���ѹݺ�
		while(true) {
		//1~9���� ���ڸ� ���� �Է�����
		String p=scanner.nextLine();
		//strike ball ���ϱ�
		boolean isEnd=play(p,c);
		//strike 
		if(isEnd==true) {
			System.out.println("HIT!");
			break;
		}
	  }
	}

	private static String makeComputer() {
		StringBuffer buffer=new StringBuffer();
		//1~9 ��������
		Random random=new Random();
		for(int i=0;i<3;i++) {
		int r=random.nextInt(9-1+1)+1;
		String rString=String.valueOf(r);
		//StringBuffer�� �ֱ�����, �ִ��� Ȯ������
		if(buffer.toString().contains(rString)==false) {
			buffer.append(rString);
			i++;
			}
		}
		return buffer.toString();
	}

	private static boolean play(String p, String c) {
		int strike=0;
		int ball=0;
		//for i ����� �ε��� 
		for(int i=0;i<p.length();i++) {
		//	for j ��ǻ�� �ε���
			for(int j=0;j<c.length();j++) {
				if(p.charAt(i)==c.charAt(j)) {
					if(i==j)  strike++;
					else ball++;
				}
			}
		}
		// p,strike,ball �������
		System.out.println(p+"\tstrike: "+strike+"\tball: "+ball);
		//p�� c�� ���� ��,return true
		if(p.equals(c))
			return true;
		//strike==�Է��� ���ڿ� ���̸�ŭ ������, HIT
		return false;
	}

}
