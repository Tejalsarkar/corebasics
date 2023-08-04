package exception;

public class TestException {
	public static void main(String[] args) {

		try {
			int a = 10;
			// System.out.println("a = "+ a);
			int b = 0;
			// System.out.println("b ="+b);
			int c = a / b;
			//System.out.println("Divisble" + c);
			String s = "100a";  
			//System.out.println("number is :" + s);
			System.out.println(s.charAt(4));
			
		}
		catch (IndexOutOfBoundsException e){
			e.printStackTrace();
			}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
			//e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("in catch block");
		}
		finally {
			
			
			System.out.println("finally block");
		}
		System.out.println("After catch block");
	}
}
 