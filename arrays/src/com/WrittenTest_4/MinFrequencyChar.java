package com.WrittenTest_4;

import java.util.Scanner;

public class MinFrequencyChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		
		char a[]=new char[size];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		int count2[]=new int [a.length];

		for(int i=0;i<a.length;i++)
		{
			int count =1;
			boolean isvisited=false;
			
			for(int k=i-1;k>=0;k--)
			{
				if (a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						count++;
					}
				}
				
				System.out.println(a[i]+" is repeted "+count+" times");
				
			}
			
			for(int l=0;l<a.length;l++)
			{
			   count2[l]=count;
			}
		}
		
		for(int j=0;j<count2.length;j++)
		{
		    int min=a[0];
			if(count2[j]<min)
			{
				min=count2[j];
				//System.out.println(a[j]);
			}
			System.out.println(min);
		}
		


	}

}
