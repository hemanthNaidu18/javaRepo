package Hemanth2;

import java.io.File;
import java.io.FileInputStream;

public class File1 
{
		public static void main(String[] args) throws Exception 
		{
			File f = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2)\\asdf.txt\"");
			
			FileInputStream fis = new FileInputStream(f);
			int asciiNum = 0;
			while((asciiNum = fis.read()) != -1)
			{
				System.out.println((char)asciiNum);
				Thread.sleep(5000);
			}
			fis.close();
		}
		}
		
		