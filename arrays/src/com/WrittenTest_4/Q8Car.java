package com.WrittenTest_4;
class Gear{
	String type;
	
	Gear(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return " Gear type: "+type;
	}
}

class SubEngine{
	String type;
	
	SubEngine(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return " SubEngine type: "+type;
	}
}

class Engine{
	int engId;
	String lastCleanDate;
	SubEngine seng;
	
	Engine(int id,String date,SubEngine s)
	{
		this.engId=id;
		this.lastCleanDate=date;
		this.seng=s;
	}
	public String toString()
	{
		return "Engine id: "+engId+"  Last clean Date: "+lastCleanDate+seng;
	}
}

public class Q8Car {

	int id;
	String color;
	Engine e;
	Gear g;
	
	   Q8Car(int id, String color, Engine e, Gear g)
	    {
		this.id = id;
		this.color = color;
		this.e = e;
		this.g = g;
	  }
	   public String toString()
		{
			return " Car id: "+id+" Color: "+color+e+g;
		}
	public static void main(String[] args) {
		Q8Car c=new Q8Car(1, "white",
				new Engine(101, "22-01-2023",new SubEngine("Dual"))
				,new Gear("Auto"));
		
		System.out.println(c.toString());
	}
}
