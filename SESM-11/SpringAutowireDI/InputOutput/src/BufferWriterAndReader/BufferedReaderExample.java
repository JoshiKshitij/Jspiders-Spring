package BufferWriterAndReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader( new FileReader("src/BufferWriterAndReader/bw.txt"));
		String line = bufferedReader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		
	}
}
