package exception;

public class TestInvalisUser {
	/*
	 * public static void main(String[] args) throws InvalidUser { String
	 * name="Rahul";
	 * 
	 * if (name.equals("Rahu")) { System.out.println("valid user"); } else { throw
	 * new InvalidUser(); }
	 * 
	 * System.out.println("raj....!!!"); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
public static void main(String[] args) {
	String name="Rahul";
	try {
		if (name.equals("Rahul")) {
			System.out.println("valid user");
		}else {
			throw new InvalidUser();
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
		System.out.println("raj....!!!");
	} 
	
	
	
	
}
