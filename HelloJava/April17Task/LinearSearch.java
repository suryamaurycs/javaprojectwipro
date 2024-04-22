//7 b).Write a function named PerformLinearSearch that searches for a specific element in an array and returns
//the index of the element if found or -1 if not found.
package April17Task;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of Array");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter the " +(i+1)+" Number :");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Searching element");
		int serele = sc.nextInt();
		int count = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] == serele) {
				System.out.println("The element is present is " +(i)+" Index Number");
				count += 1;
				
			}
			
		}
		if(count == 0) {
			System.out.println("-1");
		}
	}

}
