package Hemanth;

public class VariableTypes 
{
		//primitive variables
	int x = 10; //non static (or) primitive instance
	static String cname = "hemanth"; //primitive static
	static VariableTypes obj;
	
		public void m1()
		{ 
			int x = 20; //primitive local
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(cname);
			
		}
		public static void m2()
		{
			obj = new VariableTypes();
			System.out.println(obj.x);
			System.out.println(VariableTypes.cname);
		}
}
