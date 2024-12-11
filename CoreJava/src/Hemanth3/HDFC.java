package Hemanth3;

public class HDFC implements Rbi
{
		public static void main(String[] args) 
		{
			HDFC h = new HDFC();
			h.depsit();
			h.withdrawl();
			h.ministatement();
		}
		public void withdrawl()
		{
		System.out.println("iam overriden withdrawl in HDFC");
		 }
		public void deposit()
		{
			System.out.println("iam overriden deposit in HDFC");
		}
		public void ministatement()
		{
			System.out.println("HDFC ministatement");
		}
		@Override
		public void depsit() {
			// TODO Auto-generated method stub
			
		}
		
}

