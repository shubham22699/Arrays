package com.Array;

import java.util.Scanner;

public class RowColoumnMax {
	
	public static void rowMax(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}					
			}
			System.out.println(max+" ");
		}
	}
	public static void coloumnMax(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}					
			}
			System.out.println(max+" ");
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
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			

			System.out.println("------Maximum element from row-------");
			RowColoumnMax.rowMax(a);
			
			System.out.println("------Maximum element from coloumn -----");
			RowColoumnMax.coloumnMax(a);

	}

}
