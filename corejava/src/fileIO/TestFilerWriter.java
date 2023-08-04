
package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFilerWriter {
public static void main(String[] args) throws IOException {
	FileWriter file = new FileWriter("C:\\Users\\dipes\\Desktop\\Raj\\JatMahanDevta.txt");
	file.write("Hello Raj HOw was The Day");
	file.close();
	
}
 	
}
