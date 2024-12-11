package Hemanth1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXPattern
{
		public static void main(String[] args) 
		{
		//approach1
			Pattern p = Pattern.compile("[6789][0-9]{9}");
			Matcher m = p.matcher("5678913434");
			boolean b = m.matches();
			System.out.println(b);
		//Approach2
			boolean b1 = Pattern.matches("[6789][0-9]{9}", "9678913434");
			boolean b2 = Pattern.matches("[A-Z][a-z]*[0-9][a-z]*", "Hem2anth");
			boolean b3 = Pattern.matches("[A-Z][a-z \\. 0-9]+[@][a-z]+[\\.]{2,3}", "hemanthn.@gmail.com");
			
		}
}
