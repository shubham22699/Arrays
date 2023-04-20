package com.Array;

import java.util.Arrays;
import java.util.Scanner;

class Student
{
	int sid;
	String name;
	String addr;
	
	Student(int id,String name,String addr)
	{
		this.sid=id;
		this.name=name;
		this.addr=addr;
	}
	
	public String toString()
	{
		return sid+" "+name+" "+addr;
	}
}
public class CourseArray {
	
	int id;
	double fees;
	Student s;
	
	CourseArray(int id,double fees,Student st)
	{
		this.id=id;
		this.fees=fees;
		this.s=st;
	}
	
	public String toString()
	{
		return id+" "+fees+"  "+s;
	}

	public static void main(String[] args) {
		CourseArray[] course=new CourseArray[2];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<course.length;i++)
		{
			System.out.println("Enter course id:");
			int id=sc.nextInt();
			
			System.out.println("Enter Fee:");
			double fees=sc.nextDouble();
			
			System.out.println("Enter data for Student:");
			
			System.out.println("Enter Student name:");
			String name=sc.next();
			
			System.out.println("Enter student id:");
			int sid=sc.nextInt();
			
			
			System.out.println("Enter adrees of student:");
			String addr=sc.next();
			
			course[i]=new CourseArray(sid, fees,new Student(sid, name, addr));
			
	
		}
		System.out.println("--------------------------------------");
		
		/*for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}
		System.out.println("-------------------------------------");*/
		
		for(CourseArray c:course)
		{
			System.out.println(c);
		}
		

	}

}
