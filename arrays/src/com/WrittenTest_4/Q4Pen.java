package com.WrittenTest_4;

class Nib{
	String material;
	double width;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
}

class Refill extends Nib{
	String inkColor;
	double length;

	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	
}
public class Q4Pen extends Refill{
	String brand;
    double caplength;
  
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCaplength() {
		return caplength;
	}
	public void setCaplength(double caplength) {
		this.caplength = caplength;
	}
	/*public Refill getR() {
		return r;
	}
	public void setR(Refill r) {
		this.r = r;
	}
    */
	public static void main(String[] args) {
		Q4Pen p=new Q4Pen();
		p.setBrand("Lexi");
		p.setCaplength(2.2);
		p.setInkColor("Blue");
		p.setLength(4.4);
		p.setMaterial("Steel");
		p.setWidth(0.7);
		
		
		System.out.println(p.getBrand()+" "+p.getCaplength()+" "+p.getInkColor()+" "+p.getLength()
		                    +" "+p.getMaterial()+" "+p.width);
	}
    

}
