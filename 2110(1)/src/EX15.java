
public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stri="123456";
		String strd="123.456";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));
		//원래 string은 더하면 쭉 나열되지만 valueof로 바꿔주어서 숫자로 더해짐
	}

}
