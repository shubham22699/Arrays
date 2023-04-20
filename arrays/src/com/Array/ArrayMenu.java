package com.Array;

import java.util.Scanner;

public class ArrayMenu {
	
	public static void insertElement(int[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to be Inserted:");
		int value=sc.nextInt();
		
		System.out.println("Enter the position for insertion :");
		int position=sc.nextInt();

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
        System.out.println();

	}

	public static void delete(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index you want to delte");
		int index=sc.nextInt();
		int i;
		int size=arr.length;
		
		
		for( i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		size--;
		
		for( i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}


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
		
		boolean b=true;
		while(b)
		{
		     System.out.println("Which operation you wants to do:");
		     System.out.println("1.insertElement"
		     		+ " 2.deleteElement");
		     int option=sc.nextInt();
		     
		     switch(option)
		     {
		     case 1:ArrayMenu.insertElement(a);
		     break;
		     case 2:ArrayMenu.delete(a);
		     break;
		     }

		
		System.out.println("Wants to repeate action:");
		System.out.println("Enter=>    1.Yes"
				+ "2.No");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:b=true;
		break;
		case 2:b=false;
		}
		}
	}

}
