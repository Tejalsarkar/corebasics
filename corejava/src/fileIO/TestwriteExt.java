package fileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestwriteExt {
	public static void main(String[] args) throws Exception{
		FileOutputStream file = new FileOutputStream("C:\\Users\\dipes\\Desktop\\Raj\\TestWrite.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		e.id = 1 ;
		e.FirstName ="RAj";
		e.LastName = "JAt";
		e.Salary = 1000;
		
		
		out.writeObject(e);
		
		out.close();
		file.close();
		
		
	}

}
