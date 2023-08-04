package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinaryData {
	public static void main(String[] args) throws IOException {
		String Source = "C:\\Users\\dipes\\Downloads\\Raj.jpg";
		String target = "C:\\Users\\dipes\\Desktop\\Raj\\abc.jpg";

		FileInputStream in = new FileInputStream(Source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();

		}
		out.close();
		in.close();
	}

}
