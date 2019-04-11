import java.io.*;
public class ex03 {

	public static void main(String[] args) {
		InputStream is=System.in;
		try {
		while(true) {
			int i=is.read();
			if(i==-1)break;
			System.out.println((char)i);
		}
	}catch(IOException e) {
		e.printStackTrace();
	}

  }
}
