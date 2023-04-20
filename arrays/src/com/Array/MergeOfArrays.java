package com.Array;

import java.util.Scanner;

public class MergeOfArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of first Array:");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		System.out.println("Enter first array elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Size of second Array:");
		int size2=sc.nextInt();
		
		int b[]=new int[size2];
		System.out.println("Enter second array elements:");
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
	
        int c[]=new int [a.length+b.length];
		int memory=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[memory]=a[i];
			memory++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[memory]=b[i];
			memory++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
