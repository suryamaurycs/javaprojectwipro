package com.array;
import java.util.*;
public class TwoDArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 2,3,5,6,9} , {8,4,6,3,6} , {3,2,6,3,7} , { 4,1,8,5,5}};
	
		int sum = 0;
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<5;j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("The sum of array is :"+sum);
	}

}
