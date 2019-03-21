
public class Main {
	
	public static void main(String[] args) {
		int [] n= {100,200,300,400,500};
		String names[]= {"홍길동","논개","이순신","세종대왕","권율","신사임당"};
		
		int sum=0;
		//아래 for-each에서 k는 n[0],n[1],...,n[4]
		for(int k:n) {
			System.out.println(k+" ");
			sum+=k;
		}
		System.out.println("합은"+sum);
		
		//아래 for-each에 s는 names[0],names[1],...,names[5]로 반복
		for(String s:names) {
			System.out.print(s+" ");
			System.out.println();
		}
	}
}
