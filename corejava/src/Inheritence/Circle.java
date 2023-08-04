 package Inheritence;

public class Circle extends Shape {
	private int radius;
	public static final double PI = 3.14;
	
	public void setradius(int radius) {
		this.radius= radius;
		
		
	}
	public int getradius() {
		return radius;
		
	}
	public void area () {
		double sarea=(int)(PI *getradius()*getradius());
		System.out.println("area of circle ="+ sarea);
	}
	
	
}
