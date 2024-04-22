package com.exceptions;
import java.io.IOException;

public class ThrowAndThrowsExample {
	
	//Method using throw keyword to manually throw an exception
	public static void checkAge(int age) throws ArithmeticException{
		if(age < 18) {
			throw new ArithmeticException("Underage person cannot be processed !");
		}else {
			System.out.println("Age is Valid");
		}
	}
	
	// Method using throws keyword to declare an exception 
	
	public static void readFile() throws IOException{
		//Simulating an IOException by throwing it
		throw new IOException ("File not found!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(15); // This will t
		} catch(ArithmeticException e) {
			System.out.println("Exception caught :" + e.getMessage());
		}
		
		try {
			//Demonstraing throws keyword 
			readFile(); // This will throw an exception 
		}catch(IOException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
	}

}
