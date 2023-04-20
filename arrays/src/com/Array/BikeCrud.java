package com.Array;

import java.util.Scanner;

public class BikeCrud {

	private int id;
	private String brand;
	private String name;
	private double price;
	private String color;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BikeCrud(int id,String brand,String name,double price,String color)
	{
		this.id=id;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String toString()
	{
		return id+" "+brand+" "+name+" "+price+" "+color;
	}



	public static void main(String[] args) {
		
		BikeCrud []b=new BikeCrud[10];
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		int flag=0;
		while(true)
		{
			System.out.println("1.Add Bike");
			System.out.println("2.Update Bike");
			System.out.println("3.Delete Bike");
			System.out.println("4.Search");
			System.out.println("5 View");
			System.out.println("6 Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			int bikeId,bike_Id;
	        String brand,name,color;
	        double price;
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Add Book");
				System.out.println("Enter number of bikes");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					
					System.out.println("Enter bike name");
					name=sc.next();
					System.out.println("Enter bike id");
					bikeId=sc.nextInt();
					System.out.println("Enter brand name");
					brand=sc.next();
					System.out.println("Enter price");
					price=sc.nextDouble();
					System.out.println("Enter bike color");
					color=sc.next();
					
					b[count]=new BikeCrud(bikeId,name,brand,price,color);
					count++;
					
				}
				System.out.println("Bike added succesfully");
				break;
				
				case 2:
					System.out.println("Update Bike");
					System.out.println("Enetr bike id you want to update");
					bike_Id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(  b[i].getId()==bike_Id)
						{
							flag=1;
							System.out.println("Enter the price you want to update");
							 price=sc.nextInt();
							 b[i].setPrice(price);
						}
					}
					if(flag==0)
					{
						System.out.println("bike is not present");
					}
					break;
					
				case 3:	
					System.out.println("Delete Bike");
					System.out.println("Enetr bike id you want to update");
					 bike_Id=sc.nextInt();
					 for(int i=0;i<count;i++)
						{
							if(b[i].getId()==bike_Id)
							{
								flag=1;
								b[i]=null;
								System.out.println("Bike deleted sucessfully");
							}
			}
					 
					 if(flag==0)
						{
							System.out.println("Bike is not present");
						}
					 break;
				case 4:
					break;
					 
				case 5:
					System.out.println("Show Bikes");
					System.out.println(count);
					for(int i=0;i<count;i++)
					{
						if(b[i]!=null)
						{
						System.out.println(b[i]);
						}
					}
					break;
				case 6:
					System.exit(0);
					break;
		}
			
		
		
		
	   }
	}
}


