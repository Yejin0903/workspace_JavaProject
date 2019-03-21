
public class Main {
	
	public static void main(String[] args) {
		double score[][]= {{89,92}, //1학년 1,2학기 평균
				{94,96},  //2학년 1,2학기 평균
				{95,92}};  //3학년 1,2학기 평균
				
				double sum=0;
				for(int year=0;year<score.length;year++) { //각 학년별로 반복
					for(int term=0;term<score[year].length;term++) {
						sum+=score[year][term];//전체 평점 합
						
						int n=score.length; //배열의 행 개수,4
						int m=score[0].length; //배열의 열 개수,2
						System.out.println("3년 전체 평점 평균은"+sum/(n*m));
					}
					
					}
	}

}
