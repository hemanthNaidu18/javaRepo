package Hemanth3;

public class ICICI implements Rbi
{
		public static void main(String[] args) 
		{
		ICICI i = new ICICI();
		i.depsit();
		i.withdrawl();
		i.ministatement();
		}
		
		public void deposit()
		{
			System.out.println("iam overriden deposit in ICICI");
		}
		
		public void withdrawl()
		{
			System.out.println("iam overriden withdral in ICICI");
		}
	
		public void ministatement()
		{
			System.out.println("ICICI ministatement");
		}

		@Override
		public void depsit() {
			// TODO Auto-generated method stub
			
		}

	
}
