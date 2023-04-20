package com.Array;

class Bike{
	String brand;
	String name;
	double price;
	String color;
	Bike bike[];
	
	int count=0;
	
	Bike()
	{
		
	}
	void createBike()
	{
		bike=new Bike[3];
	}
	Bike(String brand,String name,double price,String color)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return brand+" "+name+" "+price+" "+color;
	}
	
	void insertBikeDetails(String brand,String name,double price,String color)
	{
		bike[count]=new Bike(brand,name,price,color);
		count++;
	}
	void showAllBikes()
	{
		for(Bike b:bike)
		{
			if(b!=null)
			{
				System.out.println(b);
			}
		}
	}
	
	void showBikeByBrand(String brand)
	{
		for(Bike b:bike)
		{
			if(b!=null)
			{
				if(brand==b.brand)
				{
					System.out.println(b);
				}
			}
		}
	}
	
	void updateBike(String brand,String colour)
	{
		for(Bike b:bike)
		{
			if(b!=null)
			{
				if(brand.equals(b.brand))
				{
					b.color=colour;
					System.out.println(b);
				}
			}
		}
	}
	
	void deleteBike(String brand)
	{
		for(int i=0;i<bike.length;i++)
		{
			if (bike[i]!=null)
			{
				
			    if(brand.equals(bike[i].brand))
			    {
				    bike[i]=null;
			    }
			}
		}
	}
}

public class ProjectDemo {
	
    public static void main(String[] args)
    {
		
     Bike bike=new Bike();
     
     bike.createBike();
     
     bike.insertBikeDetails("RoyalEnfield","Bullet", 280000, "Grey");
     bike.insertBikeDetails("Hero","Splendor",100000, "Black");
     
     bike.showAllBikes();
     
     System.out.println("--------------------------------");
     
     bike.showBikeByBrand("Hero");
     
     bike.updateBike("Hero","Blue");
     
     System.out.println("--------------------------------");
     bike.deleteBike("Hero");
     bike.showAllBikes();
	}
	
}
