package com.interihance;

public class TemporaryEmployee extends Employee  {
	
	public TemporaryEmployee(int eno, String ename, double salary) {
		super(eno, ename,salary);
	}
	
	public double calculateBonus() {
		//2% bonus for tempoarary employee
		return 0.02*getSalary();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
