package PrintWriterAndReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	
	public static void main(String[] args) throws Exception {
		PrintWriter printWriter = new PrintWriter(new FileWriter("src/PrintWriterAndReader/pw.txt"));
		printWriter.println("test for he print ");
		printWriter.println(true);
		printWriter.println(100);
		printWriter.println(10.5555);
		printWriter.println(154215421);
		printWriter.flush();
		
		PrintWriter printWriter2 = new PrintWriter(new FileWriter("src/PrintWriterAndReader/pw.txt", true));
		printWriter.println("test for he print ");
		printWriter.println(true);
		printWriter.println(100);
		printWriter.println(10.5555);
		printWriter.println(154215421);
		printWriter.flush();
		
	}
}
