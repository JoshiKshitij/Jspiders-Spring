package BufferWriterAndReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterExample {

	public static void main(String[] args) throws Exception {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/BufferWriterAndReader/bw.txt"));
		bufferedWriter.write("adding caharter using String");
		bufferedWriter.newLine();
		bufferedWriter.write(new char[] {'a','b','c'});
		
		bufferedWriter.flush();
		
		}
}
