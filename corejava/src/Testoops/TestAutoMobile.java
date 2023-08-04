package Testoops;

	public class TestAutoMobile {
		public static void main(String[] args) {
		
	
			MethodAutoMobile m = new MethodAutoMobile();
			
			
			m.setcolor("Black");
			System.out.println(m.getcolor());
			
			m.setMake("car");
			System.out.println(m.getMake());
			
			m.Break(20);
			m.Acceleration(20);
 
			m.setspeed(50);
			System.out.println("Initial speed = " +m.getspeed());
			
			int s=m.getspeed(); //1st gear
			int x= s+30; //2nd gear
			int y = s+30; //3rd gear
			int z = s+30; //4th gear
			
			if (gear ()==1) {
				System.out.println("speed in 1st gear is :" +s +"km/h");
			}
			else if(gear()==2) {
				System.out.println("speed in 2nd gear is :" +x +"km/h");
			}
			else if(gear()==3) {
				System.out.println("speed in 3rd gear is :" +y +"km/h");
			}
			else if(gear()==4) {
				System.out.println("speed in 4th gear is :" +z +"km/h");
			}
		}

		private static int gear() {
			return 3;
		}
 
 
 
 
}

	