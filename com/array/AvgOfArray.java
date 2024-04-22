//Write a program to find the average of array elements using function and function must return the data
package com.array;

public class AvgOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {43,54,23,65,78,586,199,92,43};
		int x = avgOfArr(myArray);
		System.out.println("The Aveage of Array is :"+x);
	}
	
	public static int avgOfArr(int [] myarr) {
		int sum = 0, avg = 0;
		for(int i = 0;i<myarr.length;i++) {
			sum += myarr[i];
		}
		return (avg = (sum/myarr.length));
	}

}
