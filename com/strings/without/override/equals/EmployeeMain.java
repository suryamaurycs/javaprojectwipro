package com.strings.without.override.equals;


public class EmployeeMain {
//Without override 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("E001","java","manager",1000.0);
		Employee emp2 = new Employee("E001","java","manager",1000.0);
		
		System.out.println("Using equals for comparing emp1 and emp2 " + emp1.equals(emp2));  // T
		System.out.println("Using ==  for comparing emp1 and emp2 - " + (emp1 == emp2));
	}

	
}
