import java.io.*;
import java.util.*;
public class sungDatasExam{
	public void readingData(String fname)throws IOException {
		try {
			FileReader fr=new FileReader(new File(fname));
			BufferedReader br=new BufferedReader(fr);
			String csvStr="";
			String tmpStr="";
			do {
				tmpStr=br.readLine();
				if(tmpStr!=null) {
					csvStr+=tmpStr+"\t";
				}
			}while(tmpStr!=null);
			StringTokenizer parse=new StringTokenizer(csvStr,"\t");
			int length=parse.countTokens()/4;
			String[] name=new String[length];
			String[] address=new String[length];
			double[] math=new double[length];
			double[] english=new double[length];
			double[] total=new double[length];
			double[] avg=new double[length];
			for(int i=0;i<length;i++) {
				name[i]=parse.nextToken();
				address[i]=parse.nextToken();
				math[i]=Double.valueOf
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
