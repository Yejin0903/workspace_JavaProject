import java.io.*;
public class InExam {

	public static void main(String[] args) {
		String a="",b="";
		int sum=0;
		float average=0;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the string(����) >");
			a=in.readLine();
			System.out.println("Enter the string(����) >");
			b=in.readLine();
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Your input is"+a+","+b);
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		sum=c+d;
		average=(float)sum/2;
		System.out.println(a+"+"+b+"="+sum);
		System.out.println("���= "+average);
	}

}
