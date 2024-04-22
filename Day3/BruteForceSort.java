//7 a) Implement a function called BruteForceSort that sorts an array using the brute force
//approach. Use this function to sort an array created with InitializeArray.
package Day3;
import java.util.*;

public class BruteForceSort {
	
	public static void BruteForceSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34,23,53,52,546,345,345,341,89,678};
		
		System.out.println("Array Before sort sorting: " + Arrays.toString(arr));
		BruteForceSort(arr);
		System.out.println("After Sort Array :"+ Arrays.toString(arr));
	}

}
