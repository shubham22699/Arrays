package com.Array;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		int a[][]=new int [4][4];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>=j)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}



	}

}
