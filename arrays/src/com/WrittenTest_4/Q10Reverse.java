package com.WrittenTest_4;

import java.util.Scanner;

public class Q10Reverse {

	public static void main(String[] args) {
		
		
		int a [][]=new int [2][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		
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
		System.out.println("---------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
