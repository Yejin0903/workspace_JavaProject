import java.io.*;
import java.util.*;
class sungDataRWExam{
	int length;
	String[] name = new String[10];
	String[] address = new String[10];
	double[] math = new double[10];
	double[] english = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];
	public void writingData(String fname, boolean append) throws IOException{
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			bw = new BufferedWriter(fw);
			for(int j = 0;j < length;j++) {
				bw.write(name[j]+"\t"+address[j]+"\t"+math[j]+"\t"+english[j]+"\t"+total[j]+"\t"+avg[j]);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch(FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다.");
		}
	}
	public void readingData(String fname)throws IOException{
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr=br.readLine();
				if(tmpStr != null) {
					csvStr += tmpStr +"\t";
				}
			}while(tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			length = parse.countTokens();
			for (int j = 0 ; j < length ; j++) {
				name[j] = parse.nextToken();
				address[j] = parse.nextToken();
				math[j] = Double.valueOf(parse.nextToken()).doubleValue();
				english[j] = Double.valueOf(parse.nextToken()).doubleValue();
				total[j] = math[j]+english[j];
				avg[j]=total[j]/2.0;
			}
		} catch(FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다.");
		}
	}
}
public class WritingDatasMain {
	public static void main(String ar[]) {
		sungDataRWExam wd = new sungDataRWExam();
		try {
			wd.readingData("writed.txt");
			wd.writingData("writing.txt", false);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
