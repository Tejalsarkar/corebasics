package fileIO;
import java.io.File;
import java.util.Date;

public class FileAttribute {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\dipes\\Desktop\\Raj\\Attributes.txt");
		

		if (f.exists()) {
			System.out.println("Name"+ f.getName());
			System.out.println("Absolute path:"+f.getAbsolutePath());
			System.out.println("Is Writable:"+f.canWrite());
			System.out.println("Is readable:"+f.canRead());
			System.out.println("Is File"+f.isFile());
			System.out.println("Is Directory"+f.isDirectory());
			System.out.println("Last Modified at"+new Date(f.lastModified()));
			System.out.println("Size"+f.length()+"bytes long.asdfghjkl");
		}
	}

}
