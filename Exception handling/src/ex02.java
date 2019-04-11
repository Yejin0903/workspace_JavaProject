
public class ex02 {

	public static void arrayMethod() throws ArrayIndexOutOfBoundsException{
		String[] irum=new String[3];
		irum[3]="홍길동";
	}
	public static void main(String[] args) {
		ex02 ts=new ex02();
		try {
			arrayMethod();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열 예외 발생");
		}
	}
}
