package com.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
		
		int a[][]=new int [3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first array element:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		int b[][]=new int[3][3];
        System.out.println("Enter second array element:");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("------------------");
		
		int c[][]=new int [3][3];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
