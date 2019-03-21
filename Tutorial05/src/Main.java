
public class Main {

	public static void main(String[] args) {
		int n=15;
		int o=015;
		int x=0x15;
		int b=0b0101;
		long g=241;
		System.out.println("10진수 15="+n);
		System.out.println("8진수 15="+o);
		System.out.println("16진수 15="+x);
		System.out.println("2진수 0101="+b);
		System.out.println(g);
		
		int y=200;
		System.out.println("10진수="+y);
		System.out.format("8진수=%oWn", y);
		System.out.format("16진수=%x",y);

	}

}
