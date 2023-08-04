package Interface;

import Inheritence.Shape;

public class Bussinessman extends Shape implements  Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("helpToOthers");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("earnmoney");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}
	
	
	

}
