package com.WrittenTest_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	
	public static void arraySort(int[]a)
	{
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[k]=a[i];
				k++;
			}
		}
		while(k<a.length)
		{
			a[k]=0;
			k++;
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");

		Q6.arraySort(arr);
		
		System.out.println(Arrays.toString(arr));


	}

}
