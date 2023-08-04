 package Clonning;

public class TesAccount {
	public static void main(String[] args) throws Exception {
		
		Account a=new Account(10);
		Account a1 = new Account(20);
		
		//a.Balance=20;
		a1=a;
		a1=(Account)a.clone();
		a1.Balance=15;
				System.out.println(a.Balance);
				System.out.println(a1.Balance);
	}
}