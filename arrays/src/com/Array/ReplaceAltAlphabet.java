package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceAltAlphabet {

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

		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));
	}

}
