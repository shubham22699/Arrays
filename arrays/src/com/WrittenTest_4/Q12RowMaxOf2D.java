package com.WrittenTest_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q12RowMaxOf2D {
	
	 public static int maxElement(int[] row){
	        int max = row[0];
	        for (int i=0;i<row.length;i++) 
	        {
	        	if(row[i]>max)
	        	{
	        		max=row[i];
	        	}
	        }
	        return max;
	        
	    }

	    public static int[] maxElementRow(int[][] matrix)
	    {
	        int[] rowMaxElements = new int[matrix.length];
	        int i = 0;
	        for(int[] row: matrix) {
	            rowMaxElements[i] = maxElement(row);
	            i++;
	        }
	        return rowMaxElements;
	    }

	public static void main(String[] args)
	{
	int a[][]=new int [3][3];
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the array Elements:");
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
    int[] maxElements = maxElementRow(a);
    System.out.println("Maximum elements in each row are as follows: ");
    System.out.println(Arrays.toString(maxElements));
		
	}

}
