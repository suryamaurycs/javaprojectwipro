package com.array;

public class TestStrainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"surya","Shivam","Sushant","Vikash"};
		//For each 
		for(String name : names) {
			System.out.print(name +" ");
		}
		
		//Display name Using For loop
		System.out.println();
		for(int i = 0;i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
	}

}
