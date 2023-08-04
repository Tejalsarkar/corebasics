package thread;

public class TestRacing {
public static void main(String[] args) {
	Racing t1 = new Racing("Rahul");
	Racing t2 = new Racing("pankaj");
	t1.start();
	t2.start();
}
}

