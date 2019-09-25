package app.container;

import org.springframework.stereotype.Component;

@Component
public class Book {

	String bookName = "Silver lining";

	public Book() {
		System.out.println("Book object created");

	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}

}
