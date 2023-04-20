package com.Array;

import java.util.Scanner;

public class RowSum {
	
	public void eachRowSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
				System.out.print(a[i][j]+" ");
			}
			
			System.out.print(" sum="+sum);
			System.out.println();
		}
	}
	public void eachColoumnSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[j][i];
				System.out.print(a[i][j]+" ");
			}
			
			System.out.print(" sum="+sum);
			System.out.println();
		}

		
	}

	public static void main(String[] args) {
		
        int a[][]=new int [3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array Elements:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		RowSum r=new RowSum();
		System.out.println("-----Row sum------");
		r.eachRowSum(a);
		System.out.println("-----Coloumn Sum-----");
		
		r.eachColoumnSum(a);

	}

}
