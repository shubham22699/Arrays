package com.Array;

import java.util.Scanner;

public class MaxMinElement {

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
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);


	}

}
