//Not run correct and solve

package com.array;
import java.util.*;

public class deleteNoArray {
	
	public static void deleteNumber(int[] arr, int n) {
		boolean temp = false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == n) {
				temp = true;			
				for(int j = i;j<arr.length - 1; j++) {
					arr[j] = arr[j+1];				
				}
				arr[arr.length-1] = 0;
				break;
		}
		}
		if(temp) {
			for(int i =0;i<arr.length;i++) {
			System.out.println(arr);
			}
		}
		else {
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr);
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {32,45,36,37,30};
		System.out.println("Enter the Number which you delete:");
		int delenum = sc.nextInt();
		
		deleteNumber(arr,delenum);

	}

}
