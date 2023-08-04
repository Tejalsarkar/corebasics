package fileIO;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class TestSerialization  {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\dipes\\Desktop\\Raj\\Serializable.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		m.id=1;
		m.name="Raj";
		m.chemistry=50;
		m.physics=60;
		m.maths=70;
		m.Total=m.chemistry+m.maths+m.physics;
		
		
		out.writeObject(m);
		
		out.close();
		file.close();
		
	}

}
