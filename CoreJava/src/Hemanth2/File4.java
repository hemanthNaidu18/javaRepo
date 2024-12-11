package Hemanth2;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class File4 
{
		public static void main(String[] args) throws Exception
		{
			File f = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2).txt\"");
			BufferedReader br = new BufferedReader(new FileReader(f));
			int asciiNum = 0;
			String text = new String();
			String line = new String();
			while((line = br.readLine()) != null)
{
			text = line + "\n";
			System.out.println(text);
			
			Thread.sleep(1000);
}
	br.close();		
}
}
