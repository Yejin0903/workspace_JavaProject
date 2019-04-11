import java.io.*;
public class ex06 {

	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("test.java");
		}catch(FileNotFoundException fe) {
			System.out.println("fe.toString() : "+fe.toString());
		}
	}

}
