package com.WrittenTest6;

import java.util.Scanner;

class Department{
	int deptId;
	String deptName;
	
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public String toString()
	{
		return "Department id: "+deptId+" Department name:"+deptName;
	}
}
public class Q7Employee {
	
	int empno;
	String name;
	Department dept;

	
	public Q7Employee(int empno, String name, Department dept) 
	{
		this.empno = empno;
		this.name = name;
		this.dept = dept;
	}

	public String toString()
	{
		return "Employee Number: "+empno+" Employee Name: "+name+" "+dept;
	}

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		
		Q7Employee []e=new Q7Employee[3];
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee Number:");
			int no=sc.nextInt();
			System.out.println("Enter Employee name:");
			String name=sc.next();
			System.out.println("Enter department id:");
			int id=sc.nextInt();
			System.out.println("Enter dapartment name:");
			String deptName=sc.next();
			
			e[i]=new Q7Employee(no, name, new Department(id, deptName));
		}
		
		for(Q7Employee emp:e)
		{
			System.out.println(emp);
		}
	}

}
