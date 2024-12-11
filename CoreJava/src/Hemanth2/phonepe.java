package Hemanth2;

public class phonepe 
{
		public static void main(String[] args) 
		{
		kotak k = new kotak();
		
		System.out.println("Through phonepe : "+k.getmainbalance());
		k.setmainbalance(5000);
		System.out.println("Through phonepe updated balance:"+k.getmainbalance());
		}
}
