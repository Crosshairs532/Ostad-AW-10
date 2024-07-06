package ostad_assignment_2;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Amount check exceeds");
		}
		else {
			super.withdraw(amount);
			System.out.println("Amount check exceeds");
		}
	}}
