package com.array;

import java.util.Arrays;

public class Approach3_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] givenArray = {"Surya","Sushant","Vikash","Saurabh"};
		System.out.println("Given Array --> " + Arrays.toString(givenArray));
		
		int firstIndex = 1, lastIndex = 2;
		
		String[] arraySlice = new String[lastIndex];
		
		System.arraycopy(givenArray, firstIndex, arraySlice,0,lastIndex);
		System.out.println("Slice Array -> " + Arrays.toString(arraySlice));
	}

}
