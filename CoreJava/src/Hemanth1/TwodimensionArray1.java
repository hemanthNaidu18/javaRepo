package Hemanth1;

public class TwodimensionArray1 
{
	public static void main(String[] args) 
	{
	int[][] a = {
			{10,20,30},
			{40,50},
			{70,80,90,10,20}
	};
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]+ " ");
		}
		System.out.println();
	}
	//int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
	}
}
