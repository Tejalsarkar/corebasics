package thread;

public class Racing extends Thread {
	String name = null;
	public static Account account = new Account();
	
	public Racing (String name) {
		this.name=name;
		this.account=new Account();
		
	}@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			this.account.deposite(name, 100);
			}
	}

}
