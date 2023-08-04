package TypeCasting;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {

	public static void main(String[] args) {
		Date d= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(d);
		System.out.println(str);

	}

}
