package Hemanth1;

import java.io.FileInputStream;

import java.util.ArrayList;

public class WrapperClassDemo 
{
		public static void main(String[] args) 
		{
		int i1 = 10;
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		Integer i3 = 30;
		System.out.println(i3);
		
		ArrayList<Integer>a = new ArrayList<Integer>();
		a.add(20);
		//a.add("hemanth");
		
		}
}
