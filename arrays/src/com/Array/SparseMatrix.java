package com.Array;

import java.util.Scanner;

public class SparseMatrix {

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
			int count=0;
			int rows=a.length;
			int coloumns=a[0].length;
			
			int size=rows*coloumns;
			
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<coloumns;j++)
				{
					if(a[i][j]==0)
					{
						count++;
					}
				}
			}
			
			if(count>(size/2))
			{
				System.out.println("Sparse Matrix");
			}
			else
			{
				System.out.println("Not Sparse matrix");
			}
			
			

	}

}
