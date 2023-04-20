package com.WrittenTest_4;

import java.util.Scanner;

public class Q7RemoveDuplicateEle {

	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1)
        {  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        
        for (int i=0; i<j; i++)
        {  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}

        
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
    
        for (int i=0; i<length; i++)  
        {
           System.out.print(arr[i]+" ");
        }
    }  
}  

