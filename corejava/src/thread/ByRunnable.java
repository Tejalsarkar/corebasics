package thread;

public class ByRunnable implements Runnable  {

	String name;
  public ByRunnable(String name) {
		this.name= name;
	}
	@Override
	public void run() {
		for (int i = 1; i <=7; i++) {
			System.out.println(i+" "+name);
		}
		
	}
	
		
	}


