package com.WrittenTest_4;

import java.util.Scanner;

public class Q1 {

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
		int evenCount=0;
		int oddCount=0;
				
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else if(a[i]%2!=0)
			{
				oddCount++;
			}
		}
		
		System.out.println("Even elements from array are:="+evenCount);
		System.out.println("Odd elements from array are:="+oddCount);


	}

}
