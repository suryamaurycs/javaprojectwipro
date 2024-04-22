package com.interihance;

public class PermanentEmployee extends Employee {
	public PermanentEmployee(int eno,String ename, double salary) {
		super(eno, ename,salary);
	}
	
	public double calculateBonus() {
		return 0.1*getSalary();
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
