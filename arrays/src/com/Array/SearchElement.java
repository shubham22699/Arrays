package com.Array;

import java.util.Scanner;

public class SearchElement {
	
	public static void searchElement(int a[],int find)
	{
		boolean b=false;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
			{
				b=true;
				index=i;
			}
		}
		if(b)
		{
			System.out.println("Element found at position "+index);
		}
		else
		{
			System.out.println("Element not found");
		}


	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		System.out.println("Enter elements for array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element for searching:");
		int find=sc.nextInt();
		
		SearchElement.searchElement(a, find);

	}

}
