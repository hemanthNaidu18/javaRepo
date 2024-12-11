package Hemanth3;

public class Childclass extends FirstAbstract
{
		public static void main(String[] args) 
		{
			Childclass obj = new Childclass();
			obj.m1();
			obj.m2();
		}
		public void m2()
		{
			System.out.println("iam m2 overiding method in Childclass");
			
		}
}
