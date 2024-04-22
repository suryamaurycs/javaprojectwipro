//Task 8 a) Implement a method SliceArray that takes an array, a starting index, and an 
//end index, then returns a new array containing  the elements from the 
//start to the end index.
package April17Task;
import java.util.*;

import java.util.Arrays;


public class SliceArray {

	public static int[] sliceArray(int[] arr, int startIndex, int endIndex) {
		if(startIndex < 0 || endIndex >= arr.length || startIndex > endIndex) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int[] slicedArray = new int[endIndex - startIndex + 1];
		int index = 0;
		
		for (int i = startIndex, j = 0; i <= endIndex; i++, j++) {
            slicedArray[j] = arr[i];
        }
		
		return slicedArray;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int startIndex = 2;
		int endIndex = 5;
		int[] slicedArray = sliceArray(arr,startIndex,endIndex);
		
		System.out.println("Before Array element :"+ Arrays.toString(arr));
		System.out.println("After Sliced Array from index " + startIndex + " to Index " + endIndex + ":" + Arrays.toString(slicedArray));
	
		

	}

}
