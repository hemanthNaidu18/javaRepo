package Hemanth1;

public class StringDemo 
{
		public static void main(String[] args) 
		{
			String p1 = "hemanth";
			System.out.println(p1);
			System.out.println(p1.length());
			System.out.println(p1.charAt(2));
			System.out.println(p1.indexOf('v'));
			
			String p2 = new String("nandikonda");
			System.out.println(p2);
			System.out.println(p1.equals(p2));
			
			String p3 = "Heanth";
			System.out.println(p3);
			System.out.println(p1.equals(p3));
			System.out.println(p1.equalsIgnoreCase(p3));
		
			String p4 = "Hemant";
			System.out.println(p4);
			System.out.println(p1.equals(p4));
			System.out.println(p1.equalsIgnoreCase(p4));
			System.out.println(p1.contains(p4.toLowerCase()));
		
			String p5 = "hemanth";
			System.out.println(p5);
			System.out.println(p5.toUpperCase());
			System.out.println(p5.toLowerCase());
		
			System.out.println(p1+p2);
			System.out.println(p1.concat(p2));
			
			String p6 = "hemanth";
			System.out.println(p6);
			System.out.println(p6.trim());
			System.out.println(p1.equals(p6));
			System.out.println(p1.equals(p6.trim()));
			
			String p7 = "hemanth";
			System.out.println(p7);
			System.out.println(p1.equals(p7));
			System.out.println(p1.equalsIgnoreCase(p7));
			System.out.println(p1.contains(p7));
			System.out.println(p1.contains(p7.trim().toLowerCase()));
			
			System.out.println(p1.substring(2, 7));
			
			System.out.println(p1.replace('h', 't'));
			
			String p8 = "hemanth nandikonda";
			System.out.println(p8);
			String[] p9 = p8.split(" ");
			for(String p:p9)
			{
				System.out.println(p);
			}
		
		}
}
