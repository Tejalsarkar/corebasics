package TypeCasting;

public class TestAccount {
public static void main(String[] args) {
	TypeAcc a = new TypeAcc();
	
	a.setNumber("CNRB2074108015755");
	a.setAccountType("Canara bank");
	a.setBalance(1300000);
	System.out.println(a.getAccountType());
	System.out.println(a.getBalance());
	System.out.println(a.getNumber());
	
	a.deposite(741);
	System.out.println("after deposite="+ a.getBalance());
	
	a.withdrawl(350000);
	System.out.println("after withdrawl="+ a.getBalance());
	
	a.fundtransfer(800000);
	System.out.println("after fund tranfer="+ a.getBalance());
	
	a.Paybill(470);
	System.out.println("after pay bill="+ a.getBalance());
	
	
	

	
}
}
