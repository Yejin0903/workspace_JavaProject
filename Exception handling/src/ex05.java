
public class ex05 {

	public static void main(String[] args) {
		try {
		int data[]=new int[] {10,20,30,40,50};
		for(int i=0;i<=data.length;i++)
			System.out.println("data["+i+"]="+data[i]); 
	}catch(ArrayIndexOutOfBoundsException aie) {
		System.out.println("aie.toString() : "+aie.toString());
	}finally {
		System.out.println("�̰��� �ݵ�� ��ģ��.");
	}
  }
}