package com.exceptions;

public class BuiltInExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Example of ArrayIndexOutOfBoundsException
			int[] array = {1,2,3};
			System.out.println(array[0]);
			
			//Example of ArithmeticException
			int result = 10 / 1; //Division by zero
			
			// Example of NullPointerException
			
//			String str = null;
//			System.out.println(str.length()); //Accessing length of null String
			
			System.exit(1);
		}catch(ArrayIndexOutOfBoundsException ae) { // Built it exception
			System.out.println("Array Index Out of Bounds Exception occurred: " +ae.getMessage());
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred: "+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception occured: "+e.getMessage());
		}
		finally {
			System.out.println(" I am a finally block");
		}
	}

}
