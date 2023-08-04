package Testoops;

public class MethodAutoMobile {
	private String Color = " ";  
	private int speed = 0;
	private String make = " ";
      
	 public void setcolor(String s) {
		 Color = s;
	 }
		  
		public String getcolor() {
			return Color;
		}
		 public void setspeed(int i) {
			 speed = i;
		 }
		 public int getspeed() {
			 return speed;
		 }
		 
		 
		 public void setMake(String s) {
			 make = s;
		 }
		 
		 public String getMake() {
			 return make;
		 }
		 
		 
		 public void Break(double d) {
			if (speed>=d) {
				System.out.println("Break: "+ (speed-10));
			}
		}
		 
		 public void Acceleration (double d) {
			 if (speed <=d) {
				 System.out.println("Acceleration:"+(speed+10) );
			 }
		 }
		 
		 
		 
		 
	 }

