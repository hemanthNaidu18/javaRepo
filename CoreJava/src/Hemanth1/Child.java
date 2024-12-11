package Hemanth1;

class parent 
{
	public Number workhard()
	{
		System.out.println("parent : wakeup early, goto college");
		return 0;
		}
		
		public void care()
		{
			System.out.println("parent : atmost care");
			}
	}
	
	public class Child extends parent
	{
	 public Number workhard()
	 {
		 System.out.println("Child : wakeup anytime, goto bar");
		 return 0;
	 }
	
		public void love()
		{
			System.out.println("Child : ima in love..");
		
		}
		public static void main(String[] args) 
		{
		Child c = new Child();
		c.workhard();
		c.care();
		c.love();
		}
}
