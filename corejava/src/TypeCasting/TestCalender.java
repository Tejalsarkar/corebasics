package TypeCasting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		String str = "22/01/2024";
		Date today = new Date ();
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(str));
		for (int i = 1; i<=12; i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
			
		}
		
		
		
		
		
	}

}
