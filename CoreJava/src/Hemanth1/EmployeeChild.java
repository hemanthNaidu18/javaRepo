package Hemanth1;

public class EmployeeChild extends Employee
{
		String city;
		
		public EmployeeChild(String city)
		{
			
			super(1566, "hemanth" ,13.44f);
			this.city = city;
			
			System.out.println(this.city);
			}
		void m3()
		{
			
		}
		public static void main(String[] args) 
		{
		EmployeeChild ec = new EmployeeChild("hyderabad");	
		}
}
