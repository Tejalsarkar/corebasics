 package Constructor;

public class ConstructorCircle extends ConstructorShape{
	public ConstructorCircle() {}
	
	public static final double PI = 3.14;
	 
	
	int radius=0;
	public ConstructorCircle(int radius) {
		this.radius=radius;
	}
		public void setRadius(int radius) {
			this.radius=radius;
		}
		public int getRadius() {
			return radius;
		}
		public void area () {
			double Carea = PI * getRadius() * getRadius();
			System.out.println("Area of Circle ="+ Carea);
		}
}
