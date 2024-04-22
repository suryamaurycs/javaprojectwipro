package com.array;

public class MiniandMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {70,78,30,45,50};
		int min = nums[0],max = nums[0];
		for(int i = 0;i<5;i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+min);
	}

}
