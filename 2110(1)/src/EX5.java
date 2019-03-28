
public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1 = " I LOVE MIRIM MEISTER ";
		String strData2 = strData1.trim();
		System.out.println("strData2.trim()->"+strData2);
		if(strData1.equals(strData2))
			System.out.println("같습니다. ");
		else
			System.out.println("다릅니다. ");
	}

}
