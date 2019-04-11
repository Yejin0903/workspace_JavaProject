//1~99까지
//숫자에 3,6,9가 있으면 "짝 아니면 숫자를 출력
public class Game369 {

	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			String numberString=String.valueOf(i);
			int count=count369(numberString);
			if(count==0) {
				System.out.println(i);
			}else {
				for(int j=0;j<count;j++) {
					System.out.println("짝");
				}
			}
				System.out.println();
			}
			
				}
	private static int count369(String numberString) {
		int sum=0;
		for(int i=0;i<numberString.length();i++) {
			char ch=numberString.charAt(i);
			if(ch=='3'||ch=='6'||ch=='9') {
				sum++;
			}
}
			return sum;
	}

}