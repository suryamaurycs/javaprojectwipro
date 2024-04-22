package com.array;
public class ArrayWithFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {43,54,23,65,78,586,199,92,43};
		int x = find_max(myArray);
		System.out.println("Max value is :"+x);

	}
	
	public static int find_max(int [] myarray) {
		int max_val = 0;
		for(int i = 0;i<myarray.length;i++) {
			if(myarray[i] > max_val) {
				max_val = myarray[i];
			}
		}
		return max_val;
	}

}

