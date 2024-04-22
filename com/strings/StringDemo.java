package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Alex"; // constant Pool
		s.concat("Martin"); // concat() method appends the string at the end"
		System.out.println(s.concat("Martin"));
		System.out.println(s); // Will print Alex because strings are immutable objects
		
		//Objects 01;
			
		//--------String Comparison -------equals-----
		//Compares this string to the specified object.
		String s1 = "Apples";
		String s2 = "Apples";
		String s3 = new String("Apples");
		String s4 = "Saurav";
		
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //false
		
		/*Notice the use of the equals method The String class overrides the equals method it 
		 * inherited from the object class and implemented logic to compare the two String objects character 
		 * by character. */
		
		// --------- 2) By using == operator---
		/* 
		 * The equality operator (==) compares the references 
		 * (address in memory) of the two Strings as two different numbers
		 * - this is known as reference equality .
		 * */
		
		System.out.println(s1 == s2); //true (because both refer to same instance)
		System.out.println(s1 == s3); // false (because s3 refers to instance created in nonpool)
		
		//---------CompareTo --------
		String s10 = "Max";
		String s20 = "Max";
		String s30 = new String("Alex");
		System.out.println(s10.compareTo(s20)); //0
		System.out.println(s10.compareTo(s30)); // 12 (because s10 >s3)
		System.out.println(s30.compareTo(s10)); 
		
		//--- String builder and buffer -- --- Mutalbe -- 
		StringBuilder builder = new StringBuilder("hello"); // Non Synchronized
		System.out.println(builder);
		
		StringBuffer buffer = new StringBuffer("hello");
		buffer.append(" Java with String buffer");
		System.out.println(buffer);
	}

}
