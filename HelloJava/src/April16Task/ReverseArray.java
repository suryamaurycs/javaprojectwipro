//Task 4: Arrays - Declaration, Initialization, and Usage
//Create a program that declares an array of integers, initializes it with 
//consecutive numbers, and prints the array in reverse order.

package April16Task;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0;i<num;i++) {
			System.out.println("Enter the "+ (i+1) +" Number :");
			arr[i] = sc.nextInt();
		}
		
		for(int i = num - 1;i>=0;i--) {
			System.out.println("The " + (i+1) + " Number is "+arr[i]);
		}

	}

}
