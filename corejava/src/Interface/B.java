package Interface;

public class B extends A{
	public B() {
		super(1,2);
		System.out.println("B is one param");
		}
public static void main(String[] args) {
	B b = new B();
}
}
