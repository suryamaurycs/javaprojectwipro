package com.strings;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = "Suryamaurya".toCharArray();
		int n = str.length;
		
		int index = 0;
		
		for(int i = 0;i<n;i++) {
			int j;
			for(j = 0;j<i;j++) {
				if(str[i] == str[j]) {
					break;
				}
			}
			
			if(j == i) {
				str[index++] = str[i];
			}
		}
		System.out.println(Arrays.copyOf(str, index));
		
	}

}
