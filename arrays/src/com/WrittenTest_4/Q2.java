package com.WrittenTest_4;



public class Q2 {
		
		static int mcCartyCounter =100;
		public static int mcCarthy(int n) {
		mcCartyCounter++;
		if (n > 100)
		return n - 10;
		else
		return mcCarthy(n+11);
		}
		public static void main(String arg[]) {
		System.out.println(mcCarthy(100) + "  " + mcCartyCounter);
		}
		


	}


