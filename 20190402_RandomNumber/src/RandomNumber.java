import java.util.Random;
import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
	
		int start=17;
		int end=17;
		Random random=new Random(); 
		int randomNumber=random.nextInt(end+1-start)+start;//Start-End ·£´ı¼ıÀÚ »ÌÀÚ'
		System.out.println(randomNumber);
		

	}

}
