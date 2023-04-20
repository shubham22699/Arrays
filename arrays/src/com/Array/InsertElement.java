package com.Array;

import java.util.Scanner;

public class InsertElement {
	
	
	public static void insertElement(int[]a,int value,int position)
	{
        int res[]=new int[a.length+1];
		
		for(int i=0;i<res.length;i++)
		{
			if (i<position)
			{
				res[i]=a[i];
			}
			else if (i==position)
			{
				res[i]=value;
			}
			else 
			{
                res[i]=a[i-1];
			}
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+",");
		}


	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6};
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter value to be Inserted:");
		int value=s.nextInt();
		
		System.out.println("Enter the position for insertion :");
		int position=s.nextInt();
		
		insertElement(a, value, position);
	}

}
