package BankingApplication;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double inBalance) {
		this.balance = inBalance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}else {
			balance = balance - amount;
			System.out.println("Withdraw sucessfucessly after Avaiable balance is: "+balance);
		}
	}

}
