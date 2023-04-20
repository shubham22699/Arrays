package com.Array;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		
		Employee [] e =new Employee[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee id:");
			int id=sc.nextInt();
			
			System.out.println("Enter name:");
			String name=sc.next();
			
			System.out.println("Enter salary");
			int salary=sc.nextInt();
			
			e[i]=new Employee(id, name, salary);
		}
		
		for(Employee emp:e)
		{
			System.err.println(emp);
		}
		
		System.out.println("------------------------");
		for(Employee emp:e)
		{
			if(emp.salary<20000)
			{
				emp.salary+=(emp.salary*10)/100;
			}
		}
		for(Employee emp:e)
		{
			System.err.println(emp);
		}

	
	}

}
