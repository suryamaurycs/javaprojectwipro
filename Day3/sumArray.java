//Task 6: Understanding Functions through Arrays
//a) Write a recursive function named SumArray that calculates and 
//returns the sum of elements in an array, demonstarte with example.
package Day3;

import java.util.*;
public class sumArray {
	
	public static int sumArr(int[] arr, int n) {
		if(n < 0) {
			return 0;
		}else {
			return arr[n] + sumArr(arr,n-1); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {1,2,3,4,5};
			System.out.println("Sum of Array is : " + sumArr(arr,arr.length-1));	
			}
			
			
	}


