package Clonning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1=new Customer ("Raj");
		c1.account.Balance=300;
		Customer c2 = (Customer)c1.clone();
		c2.name= "Rahul";
		c2.account.Balance=30;
		
		
		System.out.println(c1.name);
		System.out.println(c1.account.Balance);
		System.out.println(c2.name);
		System.out.println(c2.account.Balance);
		}
}







