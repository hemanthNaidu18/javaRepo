package Hemanth;

public class ConstructorDemo 
{
		int a,b,c;
		
		public ConstructorDemo(int a, int b)
		{
			super();
			this.a = a;
			this.b = b;
		}
		public void add()
		{
			c = a+b;
			System.out.println("Add of A & B is : " + c);
			
		}
		public void sub()
		{
			c = a-b;
		System.out.println("sub of A & B is : " + c);
		}
			public void mul()
			{
				c = a*b;
				System.out.println("mul of A & B is : " + c);
			}
			public void div()
			{
				c = a/b;
				System.out.println("div of A & B : " + c);
			}
		
		
		public static void main(String[] args) 
		{
			ConstructorDemo obj = new ConstructorDemo(10, 20);
			obj.add();
			obj.sub();
			obj.mul();
			obj.div();
		}
}