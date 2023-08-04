  package Testoops;

public class Testperson {
public static void main(String[] args) {
	
	TestName tn= new TestName();
	
	tn.setPersonName("Rahul jat");
	System.out.println(tn.getPersonName());
	
	tn.setDateOfBirth("17/01/1996");
	System.out.println(tn.getDateOfBirth());
	
	tn.setaddress("Panchapura");
	System.out.println(tn.getaddress());
	
	System.out.println(tn.getavgAge());
	
}
}
