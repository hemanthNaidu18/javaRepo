package Hemanth2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File5 
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2).txt\"");
		if(f.exists())
			f.delete();
		f.createNewFile();
		String text = "Hello How Are you";
		
		FileOutputStream fos = new FileOutputStream(f);
		for(char ch : text.toCharArray())
				fos.write(ch);
		
		fos.close();
		
	}
}
