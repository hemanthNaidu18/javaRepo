package Hemanth3;

public interface Rbi 
{
		int x = 10;
	
		public void withdrawl();
		public void depsit();
		
		public default void ministatement()
		{
			login();
			savingAccount();
			System.out.println("implement code");
		}
		
		public static void savingAccount()
		{
			login();
			System.out.println("static savingAccount");
		}
		public static void login()
		{
			System.out.println("iam login");
		}
		public static void main(String[] args) 
		{
			Rbi i;
			
			i = new HDFC();
			i.depsit();
			i.withdrawl();
			
			i = new ICICI();
			i.depsit();
			i.withdrawl(); 
		}
}
