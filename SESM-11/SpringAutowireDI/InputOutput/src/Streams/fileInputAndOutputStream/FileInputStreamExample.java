package Streams.fileInputAndOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("src/Streams/fileInputAndOutputStream/inputStream.txt");
		FileInputStream inputStream = new FileInputStream(file);
		int ch = inputStream.read();

		while (ch > 0) {
			System.out.print((char) ch);
			ch = inputStream.read();
		}
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		
		FileInputStream inputStream2 = new FileInputStream(file);
		byte[] by = new byte[inputStream2.available()];
		inputStream2.read(by);

		for (byte b : by) {
			System.out.print((char) b);
		}
		System.out.println();
		
		inputStream.close();
		inputStream2.close();
	}
}
