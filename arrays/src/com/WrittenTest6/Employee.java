package com.WrittenTest6;

class Programmer{
	
	public void workingHours()
	{
		System.out.println(8);
	}
}
public class Employee extends Programmer{
    @Override
	public void workingHours()
	{
		System.out.println(6);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.workingHours();

	}

}
