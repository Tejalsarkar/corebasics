package TypeCasting;

  public class TestClassAccount {
	  public static void main(String[] args) {
	 TypeAcc a = new TypeAcc ();
	 a.setAccountType("sbi");
     a.setNumber("123456789");
     a.setBalance(4000);
     System.out.println(a.getAccountType());
     System.out.println(a.getBalance());
     System.out.println(a.getNumber());
     if (a.getBalance()>=5000) {
    	 System.out.println("your balance is =" + a.getBalance());
     }
     else {
    	 System.out.println("Insufficient Balance");
    	 System.out.println("your Currrent Balance is ="+ a.getBalance());
     }
     
     
}
	  
		  
	  }
	  
