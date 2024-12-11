package Hemanth3;

public abstract class FirstAbstract 
{
		int x =10;
		public void m1()
		{
			System.out.println("iam m1 concrete method in FirstAbstract");
		}
		public abstract void m2();
		
		public static void main(String[] args) 
		{
			FirstAbstract obj = new Childclass();
			obj.m1();
			obj.m2();
		}
}
