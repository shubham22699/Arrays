package com.Array;

import java.util.Arrays;

public class New {

	public static void main(String[] args) {
	String str1="shubham";
	String str2="arvind";
	
	char []a=str1.toCharArray();
	char[]b=str2.toCharArray();
	
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	String st1=new String(a);
	String st2=new String(b);
	
	boolean isCheck=false;
	
	if(st1.compareTo(st2)==0)
	{
		isCheck=true;
	}
	if(isCheck)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
	}

}
