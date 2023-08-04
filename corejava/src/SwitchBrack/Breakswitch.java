package SwitchBrack;

public class Breakswitch {
public static void main(String[] args) {
	int DayOfWeek = 8;
	String Dayname;
	switch (DayOfWeek) {
	case 1 :
		Dayname = "Sunday";
		break;
	case 2:
		Dayname = "monday";
		break;
	case 3 :
		Dayname = "tuesday";
		break;
	case 4:
		Dayname = "wednesday";
		break;
	case 5:
		Dayname = "thursday";
		break;
	case 6:
		Dayname = "friday";
		break;
	case 7 :
		Dayname = "saturday";
		break;
		default :
			Dayname = "Invalid day";
		break;
	}
		{
		System.out.println("The day is: " + Dayname);
	}
}
}