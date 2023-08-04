package exception;

public class Account extends Exception {
	private double balance = 0;

	public Account() {
		super("mera");
		System.out.println("insufficient balance");
	}

	public double getBalace() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double d) {
		balance = balance + d;
		System.out.println("Deposite Amount is : " + d);
	}

	public void withdrawl(double amt) throws Account  {
		if ((balance - amt) < 2000) {
			throw new Account();
		} else {
			balance = balance - amt;
			System.out.println("withdrawl Amount is :" + amt);
			System.out.println("Current Balance is :" + balance);
		}

	}

}
