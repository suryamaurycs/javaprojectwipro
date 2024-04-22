package com.employee;

public class UseEmployee {

	public static void main(String[] args) {  // Varagrs
		// TODO Auto-generated method stub
		
		final double AverageSalary = 98253d;
		
		//Array 
		Employee[] empObjects = new Employee[4];  // array declaration
		//create & initialize actual employee objects using consts
		empObjects[0] = new Employee("Shivam",2342f);
		empObjects[1] = new Employee("shubham",4636f);
		empObjects[2] = new Employee("vikash",3536f);
		empObjects[3] = new Employee("Surya",3678f);
		
		
		//display the employee object data
		System.out.println("Employee Object 1: "+empObjects[0]);
		System.out.println("Employee Object 2: "+empObjects[1]);
		System.out.println("Employee Object 3: "+empObjects[2]);
		System.out.println("Employee Object 4: "+empObjects[3]);

	}

}
