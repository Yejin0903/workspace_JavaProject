import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Phone {

	public static void main(String[] args) {
		FileWriter fw=null;
		Scanner scanner=new Scanner(System.in);
		try {
			fw=new FileWriter("Phone.txt");
			
			System.out.println("��ȭ��ȣ �Է����α׷��Դϴ�.");
			while(true) {
				System.out.print("name Phonenumber>>");
				String one=scanner.nextLine();
				if(one.contentEquals("�׸�"))
					break;
				fw.write(one+"\r\n");
			}
			scanner.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
