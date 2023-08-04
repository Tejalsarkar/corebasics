package exception;

public class TestAccount {
public static void main(String[] args) throws Account {
	Account ac= new Account();
	ac.deposite(5000);
	//ac.withdrawl(3001);
	ac.withdrawl(3000);
}
}
