package ostad_assignment_2;

public class BankAccount {
	protected int balance;
	
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("main balace is "+ balance);
	}
	public void withdraw(int amount) {
		if(amount> this.balance) {
			System.out.println("Amount exceeds");
		}
		else {
			this.balance-=amount;
		}
	}
	
	public static void main(String[] args) {
		SavingsAccount saving = new SavingsAccount(1000);
		CheckingAccount check = new CheckingAccount(1000);
		BankAccount bank = new BankAccount(1000);
		
	}
}
