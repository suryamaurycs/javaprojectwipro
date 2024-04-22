package com.employee;

public class Employee {
	static String company = "wirpo";
	
	static int no = 100;
	
	static void display() {
		System.out.println("Company :"+Employee.company);
	}
	
	private int empNo;
	private String Name;
	private float Salary;
	
	public Employee(String name, float salary) {
		super();
		this.empNo = no++;
		 Name = name;
		 Salary = salary;
	}
	
	public void showData() {
		System.out.println(empNo + " : " + Name + " :" + Salary);
		
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
	
	
	

}
