import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class StudentAverages2 {

	public static void main(String[] args)throws IOException {
	Scanner nTake=new Scanner(new File("E:\\StudentAverages\\StudentScores.in"));
	int maxIndx=-1;
	String text[]=new String[1000];
	while(nTake.hasNext())
		{
		maxIndx++;
		text[maxIndx]=nTake.nextLine();
		}
	
	nTake.close();
	
	FileWriter fw=new FileWriter("E:\\StudentAverages2\\StudentScores2.txt");
	PrintWriter output=new PrintWriter(fw);
	int sum = 0;
	int average = 0;
	for(int n=0;n<=maxIndx;n++)
		{
		Scanner inArray=new Scanner(text[n]);
		String name=inArray.next();
		sum=0;
		average = 0;
		while(inArray.hasNextInt()) {
			average+=inArray.nextInt();
			sum++;	
			}
		
		
		output.println(name+": "+(average/sum));
		}
	output.close();
	fw.close();
	}
}