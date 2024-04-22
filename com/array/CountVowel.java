package com.array;
import java.util.*;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] vowel = {'w','i','p','r','o'};
			int count = 0;
			for(char ch : vowel) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			System.out.println("The Vowel in wipro is : "+count);
	}

}
