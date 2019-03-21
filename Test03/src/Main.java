
public class Main {
	
	public static void main(String[] args) {
		int[] n=new int[10];
		int i,temp;
		
		for(i=0;i<10;i++) 
			n[i]=i+1;
		
		for(i=0;i<10;i++)
			System.out.print(n[i]+" ");
		
		System.out.println();
		
		for(i=0;i<5;i++) {
			temp=n[i];
			n[i]=n[9-i];
			n[9-i]=temp;
		}
		for(i=0;i<10;i++)
			System.out.print(n[i]+" ");
			
			}
}
