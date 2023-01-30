package org.ssglobal.training.codes.itemB;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<>();

	public boolean addBook(Book book) {
		return books.add(book);
	}

	public Book deleteBook(String ISBN) {
		Book book = null;
		
		for (int i = 0; i < books.size(); i++) {
			book = books.get(i);

			if (book.ISBN().equals(ISBN)) {
				books.remove(i);
				return book;
			}
		}
		return book;
	}

	public boolean updateBook(String ISBN, Book updatedBook) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);

			if (book.ISBN().equals(ISBN)) {
				books.set(i, updatedBook);
				return true;
			}
		}
		return false;
	}

	public List<Book> getBooks() {
		return books;
	}

}
