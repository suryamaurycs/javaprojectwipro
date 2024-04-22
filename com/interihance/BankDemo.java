package com.interihance;

//SuperClass
class Account{
	protected String accountNumber;
	protected double balance;
	
	//constructor
	public Account(String accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method to deposite money
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " deposited. Current Balance is :"+balance);		
	}
	
	//Method to withdraw money
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + " withdrawn. Current Balance " + balance);
		}else {
			System.out.println("Insuffient funds. Withdrawal not processed");
		}
	}
	
	//Method to display account information 
	public void displayAccountInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance :"+balance);
	}
}

//Subclass
class SavingsAccount extends Account{
	private double interestRate;
	
	//constructor 
	public SavingsAccount(String accountNumber,double balance, double interestRate) {
		//"S12345678",1000.0, 5.0
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	//Method to calculate interest
	public void calculateInterest() {
		double interest = balance*interestRate/100;
		deposit(interest);
	}
}

public class BankDemo {
	public static void main(String[] args) {
		// Create a savings account
		SavingsAccount savingsAccount = new SavingsAccount("S1234567",1000.0,5.0);
		
		//Display initial account information
		System.out.println("Initial Savings account information: ");
		savingsAccount.displayAccountInfo();
		
		//Deposit and withdraw money
		savingsAccount.deposit(500.0);
		savingsAccount.withdraw(200.0);;
		
		//Calculate interest
		System.out.println("\nCalculating Interest ....");
		savingsAccount.calculateInterest();
		
		//Display final account information
		System.out.println("\nFinal Savings Account Information:");
		savingsAccount.displayAccountInfo();

	}

}
