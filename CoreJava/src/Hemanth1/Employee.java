package Hemanth1;

public class Employee 
{
		int eno;
		String ename;
		float sal;
		
		public Employee(int eno)
		{
			this.eno = eno;
			
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
		}
		public Employee(int eno, String ename)
		{
			this(eno);
			
			this.eno = eno;
			this.ename = ename;
			
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
			}
		public Employee(int eno, String ename, float sal)
		{
			this(eno , ename);
			this.eno = eno;
			this.ename = ename;
			this.sal = sal;
			
			System.out.println(this.eno);
			System.out.println(this.ename);
			System.out.println(this.sal);
		}
		public static void main(String[] args)
		{
			Employee e4 = new Employee(1566, "hemanth",13.44f);
				}
}
