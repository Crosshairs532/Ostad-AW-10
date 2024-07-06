package ostad_assignment_2;

public class CheckingAccount extends BankAccount {
	
	
	public CheckingAccount(int balance) {
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
			System.out.println("Amount check exceeds"+balance);
		}
	}
}
