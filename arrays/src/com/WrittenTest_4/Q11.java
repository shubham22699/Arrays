package com.WrittenTest_4;

public class Q11 {

	public static void main(String[] args) {
		int a1[]= {1,2,3};
		int[] a2;

		a2 = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
	
		System.out.println(a2[i]);
		}
	}

}
