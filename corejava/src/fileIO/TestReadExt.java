package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestReadExt {
	public static void main(String[] args) throws IOException, Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dipes\\Desktop\\Raj\\TestWrite.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee)in.readObject();
		
		System.out.println(e.id);
		System.out.println(e.FirstName);
		System.out.println(e.LastName);
		System.out.println(e.Salary);
	
		in.close();
		file.close();
		
		
		
		
		
	}

}
