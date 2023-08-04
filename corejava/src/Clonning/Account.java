package Clonning;

public class Account implements Cloneable {
	int Balance=0;
	public int balance;
	
	public Account (int balance) {
		this.balance=balance;				
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

	}


