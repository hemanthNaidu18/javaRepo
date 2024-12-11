package Hemanth2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class program2
{
		public static void main(String[] args) throws IOException
		{
			File file = new File("");
			if(file.exists())
				file.createNewFile();
			file.delete();
			
			FileInputStream fis = new FileInputStream(file);
			int asciiCode;
			String text = new String();
			while((asciiCode = fis.read()) != -1) {
				text += String.valueOf((char)asciiCode);
			System.out.println((char)fis.read()); 
			//System.out.print((char)asciiCode);
		}
			System.out.println();
			System.out.println(text);
		fis.close();
}
}