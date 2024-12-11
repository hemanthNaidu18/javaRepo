package Hemanth1;

public class VariableTypes 
{
	int x= 20;//primitive instance
	static String cname = "vmware";//primitive static
	static VariableTypes obj;
	
	public void m1()
	{
		int x = 100;//primitive local
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
		}
	public static void  m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
		public static void main(String[] args) 
		{
			obj = new VariableTypes();
			System.out.println(obj.x);
			System.out.println(VariableTypes.cname);
		}
}
