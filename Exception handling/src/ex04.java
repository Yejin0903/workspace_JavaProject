
public class ex04 {

	public static void main(String[] args) {
		try {
		String str=null;
		System.out.println("���ڿ� : "+str.length());
	}catch(NullPointerException npe) {
		System.out.println("npe.toString() : "+npe.toString());
	}finally {
		System.out.println("������ ����");
	}
  }
}
