package com.interihance;

public class Employee {
	private int eno;
	private String ename;
	private double salary;
	
	public Employee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	
	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee permanenetEmployee = new PermanentEmployee(3245,"Surya",80000);
		TemporaryEmployee temporarayEmployee = new TemporaryEmployee(2342,"Shivam",40000);
		
        System.out.println("Employee No: " + permanenetEmployee.getEno());
        System.out.println("Employee Name: " + permanenetEmployee.getEname());


	}

}
