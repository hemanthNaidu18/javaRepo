package Hemanth1;

import java.util.Scanner;

public class SingleDimensionArray 
{
		public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Array size : ");
		int asize = obj.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = obj.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum+a[i];	
		}
		System.out.println("sum of the array is : " + sum);
	}
		}