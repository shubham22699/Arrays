package com.WrittenTest_4;

public class Q13 {

	public static void main(String[] args) {
		
		int buzz = 0,fizz = 0,buzzfizz=0;
		
		for(int i=1;i<=50;i++)
		{
			if (i%3==0 && i%5==0)
			{
			    System.out.println("buzzfizz");	
			    buzzfizz++;
			}
			else if (i%3==0)
			{
				System.out.println("buzz");
				buzz++;
			}
			else if (i%5==0) 
			{
				System.out.println("fizz");
				fizz++;
			}

			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("count of buzz is: "+buzz);

		System.out.println("count of fizz is: "+fizz);

		System.out.println("count of buzzfizz is: "+buzzfizz);

	}

}
