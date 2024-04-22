package com.array;
import java.util.*;


//Arrayy Slicing is the process of returning a subarray of the given array based on the 
public class Approach1_ArraySliceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givenArray = {1,2,3,4,5};
		System.out.println("Given Array -> " +Arrays.toString(givenArray));
		
		int firstIndex = 2, lastIndex = 4;
		
		int[] arraySlice = new int[lastIndex - firstIndex];
		
		for(int i = 0;i < arraySlice.length;i++) {
			arraySlice[i] = givenArray[firstIndex + i];
			
		}
		
		System.out.println("Sliced Array -> " + Arrays.toString(arraySlice));
	}

}
