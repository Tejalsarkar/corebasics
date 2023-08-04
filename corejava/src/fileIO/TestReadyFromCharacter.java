  package fileIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadyFromCharacter {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\dipes\\Desktop\\Raj\\Jat Raj.txt",true));
		String line = reader.readLine();
		while(!(line.equals("Ab Rook Ja"))) {
		out.println(line);
		line = reader.readLine();
	}
		out.close();
		reader.close();
		in.close();
}
}