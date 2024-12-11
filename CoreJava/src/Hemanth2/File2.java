package Hemanth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2 
{
		public static void main(String[] args) throws Exception
		{
			File f = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2).txt\"");
			
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine());
			{
				System.out.println(sc.nextLine());
				Thread.sleep(1000);
			}
			sc.close();
		}
}
 