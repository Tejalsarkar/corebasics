package thread;

public class TestRunnable {
	public static void main(String[] args) {
	ByRunnable b1= new  ByRunnable("RAHUL");
	ByRunnable b2 = new ByRunnable("PANKAJ");
	Thread t1= new Thread(b1);
	Thread t2 = new Thread(b2);
	t1.start();
	t2.start();
	}

}
