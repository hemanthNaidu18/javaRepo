package Hemanth2;

public class kotak 
{
		private int mainbalance = 1000;
		
		public int getmainbalance()
		{
			System.out.println("Through kotak Bank : "+mainbalance);
			return mainbalance;
		}
		public void setmainbalance(int mainbalance)
		{
			this.mainbalance = mainbalance;
		}
		public static void main(String[] args) 
		{
			kotak k = new kotak();
			System.out.println("Through kotak Bank : "+k.mainbalance);
			
		}
}
