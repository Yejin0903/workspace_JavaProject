
public class ForArrayDemo {

	public static void main(String[] args) {
		int sum = 0;
		int[] intArray;
		intArray = new int[100];
		//intArray[0]=1;
		
		for(int i=0; i<100; i++) {
			intArray[i]=i+1;
			sum +=i;
		}
		for(int k:intArray) {
			System.out.println(""+k);
			
		}
System.out.println("/n гу╟Х:" +sum);
	}

}
