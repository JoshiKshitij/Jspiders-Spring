package fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExakple {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("src/fileWriterAndReader/test1.txt");
		
		// this method will read the only one character of the txt file and will print its unicode value
		int ch = reader.read();
		
		while(ch > -1) {
			System.out.print((char)ch);
			ch = reader.read();
		}
		System.out.println();

		
	}

}
