
public class ex02 {

	public static void arrayMethod() throws ArrayIndexOutOfBoundsException{
		String[] irum=new String[3];
		irum[3]="ȫ�浿";
	}
	public static void main(String[] args) {
		ex02 ts=new ex02();
		try {
			arrayMethod();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("�迭 ���� �߻�");
		}
	}
}
