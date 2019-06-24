package Streams.fileInputAndOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEmample {

	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream("src/Streams/fileInputAndOutputStream/fileout.txt",true);
		outputStream.write(97);
		outputStream.flush();
		outputStream.write(new byte[] {102,124,97,98,99,100});
		
		outputStream.write(' ');
		outputStream.flush();
		
	}
}
