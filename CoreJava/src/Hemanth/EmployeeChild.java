package Hemanth;

public class EmployeeChild  extends Employee
{
	String city;
	
	public EmployeeChild(String city)
	{
		super(123, "Hemanth", 10.33f);
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
