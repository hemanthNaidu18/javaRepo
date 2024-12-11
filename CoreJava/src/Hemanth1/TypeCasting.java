package Hemanth1;

public class TypeCasting 
{
		public static void main(String[] args) 
		{
		int x1 = 90;
		System.out.println(x1);
		
		double x2 = x1;
		System.out.println(x2);
		
		int x3 = (int)x2;
		System.out.println(x3);
		
		char x4 = (char)x1;
		System.out.println(x4);
		//TypeCasting from 1 primitive type to corresponding wrapper class type
		
		int p1 = 10;
		System.out.println(p1);
		
		Integer p2 = Integer.valueOf(p1);
		System.out.println(p2);
		
		int p3= (int)p2;
		System.out.println(p3);
		
	//TypeCasting from 1 wrapper class type to another wrapper class type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		System.out.println(i1+i2);
		
		Integer c1 = Integer.valueOf(i2);
		Integer c2 = Integer.valueOf(i2);
		}
}
