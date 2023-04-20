package com.Array;

import java.util.Scanner;

public class SecondMax {

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

		int max=a[0],secMax=a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				secMax=max;
				max=a[i];
			}
			else if(a[i]>secMax && a[i]!=max)
			{
				secMax=a[i];
			}
		}
		
		System.out.println("Maximum: "+max);
		System.out.println("Second Maximum: "+secMax);

	}

}
