package com.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Surya";
		String res = "";
		
		char[] charStr = str.toCharArray();
		int s = 0;
		int e = charStr.length - 1;
		
		while(s < e) {
			char temp = charStr[s];
			charStr[s] = charStr[e];
			charStr[e] = temp;
			
			s++;
			e--;
		}
		System.out.println(charStr);
	}

}
