package com.WrittenTest6;

import java.util.Scanner;

public class UniqueElements {

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

		int[]unique=new int[a.length];
		int index=0;
		int count;
		for(int i=0;i<a.length;i++)
		{
			count=0;
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
				    if(a[i]==a[j])
				    {
				    	count=1;
				    	break;
				    }
			    }
			}
			
			if(count==0)
			{
				unique[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(unique[i]+" ");
		}

	}

}
