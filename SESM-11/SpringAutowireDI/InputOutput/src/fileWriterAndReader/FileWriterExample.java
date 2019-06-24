package fileWriterAndReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("src/fileWriterAndReader/test1.txt");
		fileWriter.write("hello Kshitij \n");
		fileWriter.write(new char[] {'a','1',','});
		fileWriter.flush();
		
		
		// this writer constructor will not create a new file bt will apnned the last file
		FileWriter fileWriter2 = new FileWriter("src/fileWriter/test1.txt",true);
		fileWriter2.write("\n hello Kshitij Joshi \n");
		fileWriter2.write(new char[] {'s','h','a','r','m','a'});
		fileWriter2.flush();
		
		
	}
}
