
public class ArrayDemo {

	public static void main(String[] args) {
		int[] intScoreArray= new int[17];
		System.out.println(intScoreArray);
		
		intScoreArray[0]=80; intScoreArray[1]=81; intScoreArray[2]=82;
		intScoreArray[3]=83; intScoreArray[4]=84; intScoreArray[5]=85;
		intScoreArray[6]=86; intScoreArray[7]=87; intScoreArray[8]=88;
		intScoreArray[9]=89; intScoreArray[10]=90; intScoreArray[11]=91;
		intScoreArray[12]=92; intScoreArray[13]=93; intScoreArray[14]=94;
		intScoreArray[15]=95; intScoreArray[16]=96;
		
		//배열안의 값을 출력하기
		for(int i=0; i<17; i++) {
			System.out.print(intScoreArray[i] + "");
		}
	}

}
