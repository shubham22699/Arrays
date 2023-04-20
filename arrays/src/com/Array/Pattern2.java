package com.Array;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		int a[][]=new int [4][4];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array Elements:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int x[]:a)
		{
			for(int n:x)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0|| i==j|| j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
