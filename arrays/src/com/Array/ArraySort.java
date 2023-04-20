package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	
	
	public static void arraysort(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j]) {

					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.next().charAt(0);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");

		ArraySort.arraysort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
