package com.Array;

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		System.out.println("Sum of Array Element is: "+sum);
	}

}
