package Hemanth2;

import java.io.File;

import java.io.FileReader;

public class File3 
{
		public static void main(String[] args) throws Exception 
		{
			File f = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2).txt\"");
			
			FileReader fr = new FileReader(f);
			int asciiNum = 0;
			while((asciiNum = fr.read()) != -1)
			{
				System.out.println((char)asciiNum);
				Thread.sleep(1000);
			}
		}
}
