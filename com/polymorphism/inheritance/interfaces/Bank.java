package com.polymorphism.inheritance.interfaces;
@FunctionalInterface // - if you are defining an interface with @FunctionalInterface you could one and one method decalration 
public interface Bank {
	//String name;
	public static final String country = "India";
	
	float getRateOfInterest();
	default void display() {  // when you want to apply common functionality on all class whoever are implementing it.
		System.out.println("Welcome to Java");
	}
	


}
//Prior 1.8 from 1.8 