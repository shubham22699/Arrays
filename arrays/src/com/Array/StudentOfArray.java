package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentOfArray {
	int id;
	String name;
	int marks[];
	
	StudentOfArray(int id,String name,int []marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args)
	{
		StudentOfArray s[]=new StudentOfArray[3];
		Scanner sc=new Scanner(System.in);

		
		for(int i=0;i<s.length;i++)
		{
		
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			System.out.println("Enter name");
			String name=sc.next();
			
			System.out.println("Enter the marks:");
			int []m=new int [3];
			
		
			for(int j=0;j<m.length;j++)
			{
				m[j]=sc.nextInt();
			}
		
			s[i]=new StudentOfArray(id, name, m);
			
		
		}
		
		System.out.println("--------------------------------------");
		
		for(StudentOfArray st:s)
		{
			int []mk=st.marks;
			
			int sum=0;
			for(int i=0;i<mk.length;i++)
			{
				sum+=mk[i];
			}
			int per=sum/mk.length;
			
			if(per>60)
			{
				System.out.println(st+"      per="+per);
			}
		}

	}

}

