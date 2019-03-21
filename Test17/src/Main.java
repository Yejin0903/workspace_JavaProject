
public class Main {
	
	public static void main(String[] args) {
		
		int a=1,b=1,c,i;
		System.out.print(a+" "+b);
		for(i=3;i<=20;i++) {	
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			}
		}
		

}
