package fileIO;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader( "C:\\Users\\dipes\\Desktop\\Raj\\JatDevta.txt");
		int ch = file.read();
		while(ch != -1) {
			System.out.print((char)ch);
		 
			ch=file.read();
		}
		file.close();
		
	}

}
