package thread;

public class Account {
	private int  balance = 0;
	
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch ( InterruptedException e) {
		
		}
		this.balance = balance;
	}
	
	public int getBalance() 
	{
		try {
			Thread.sleep(200);
		} catch ( InterruptedException e) {		
			
		}
	      return balance;
	}
	public synchronized void deposite (String name,int amount) {
				
		
		
		int total = getBalance()+amount;
		
		setBalance(total);
		
		System.out.println(name+"balance="+getBalance());
	}

}
