package Hemanth1;

public class UserDefineArray 
{
		public static void main(String[] args) 
		{
		Student s1 = new Student(1, "s1");
		Student s2 = new Student(2,"s2");
		Student s3 = new Student(3, "s3");
		Student s4 = new Student(4, "s4");
		Student s5 = new Student(5, "s5");
		
		Student[] obj = new Student[5];
		obj[0]=s1;
		obj[1]=s2;
		obj[2]=s3;
		obj[4]=s4;
		obj[5]=s5;
		
		for(Student i:obj)
		{
			System.out.println(i);
		}
		}
}
