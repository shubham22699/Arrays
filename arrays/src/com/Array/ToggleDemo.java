package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleDemo {

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


		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a'&& arr[i]<='z')
			{
				arr[i]=(char) (arr[i]-32);
			}
			else if(arr[i]>='A'&& arr[i]<='Z')
			{
				arr[i]=(char)(arr[i]+32);
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
