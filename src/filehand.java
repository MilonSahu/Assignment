import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehand {
public static void main(String[] args) throws IOException {
//	FileWriter f=new FileWriter("C:\\Users\\TYSS\\Desktop\\demo2\\abcd.txt");
//	BufferedWriter b= new BufferedWriter(f);
//	b.write("my name");
//	b.newLine();
//	b.write("is");
//	b.flush();
//	System.out.println("execute");
	FileReader f=new FileReader("C:\\Users\\TYSS\\Desktop\\demo2\\abcd.txt");
	BufferedReader b=new BufferedReader(f);
	String line=b.readLine();
	int count=0;
	while(line!=null)
	{
		String[] words=line.split(" ");
		for(String obj:words)
		{
			count++;
		}
		line=b.readLine();
		
	}
	System.out.println("execute");
	System.out.println(count);
	
	
	
}
}
