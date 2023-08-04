package fileIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserilazation {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\dipes\\Desktop\\Raj\\Serializable.txt ");
		ObjectInputStream in = new ObjectInputStream (file);
		
		Marksheet m = ( Marksheet)in.readObject();
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.physics);
		System.out.println(m.Total);
		in.close();
		file.close();
		
				
	}

}
