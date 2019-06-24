package tut1;

import java.io.File;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) {
		System.out.println("apps started");
		File f = new File("any.txt") ;
		
		File f2 = new File("direcotryName","fileName");
		
		
		File f3 = new File("any") ;
		File f4 = new File(f3,"fileName");
		try {
			int read = System.in.read();
			System.out.println((char)read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
