package Hemanth1;

public class Student 
{
		int sno;
		String sname;
		
		public Student(int sno, String sname)
		{
			super();
			this.sno = sno;
			this.sname = sname;
		} 
		
		public String tostring() 
		{
			return "Student [sno=" + sno + ", sname=" +sname + "]";
			}
		public static void main(String[] args) 
		{
		Student s1 = new Student(1744, "Hemanth");
		System.out.println(s1);
		}
}
