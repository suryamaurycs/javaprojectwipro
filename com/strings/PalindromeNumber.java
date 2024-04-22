package com.strings;


public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "madam";
		String s = "malayalam";
		int i = 0,j = s.length() - 1;
		boolean flag = true;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
			
		}
		if(flag)
		{
			System.out.println(s+ " is Palindrome word");
		}
		else {
			System.out.println(s + " is not palindrome word");
		}
	}

}
