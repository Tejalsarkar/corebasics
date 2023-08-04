 package Interface;

public class A {
	public A()  {
		System.out.println("Default");
		}

		public A (int a) {
			this();
		System.out.println("one param");
}
		public A(int a,int b) {
			this(1);
			System.out.println("two param");
		}
}