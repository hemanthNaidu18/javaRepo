package Hemanth1;

public class methodOverloading 
{
		//A class cannot contain 2 same methods with same signatures, otherwise it's a CE.
		
	public void m1(Object x)
	{
		System.out.println(x);
	}
		public static void main(String[] args) 
		{
			methodOverloading obj = new methodOverloading();
			obj.m1(100);
			obj.m1(11.11f);
			obj.m1("hemanth");
			obj.m1(200);
			obj.m1(20.22f);
			obj.m1("naidu");
			}
}
