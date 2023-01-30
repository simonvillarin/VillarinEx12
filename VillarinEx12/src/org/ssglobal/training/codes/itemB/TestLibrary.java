package org.ssglobal.training.codes.itemB;

import java.util.List;

public class TestLibrary {

	public static void main(String[] args) {
		Library library = new Library();

        Book book1 = new Book("Game of Thrones", "123", "George R. R. Martin", 1, "Bantam Spectra", 1996);
        Book book2 = new Book("Harry Potter", "456", "J. K. Rowling", 2, "Bloomsbury", 1997);
        Book book3 = new Book("The Great Gatsby", "789", "F. Scott Fitzgerald", 3, "Charles Scribner's Sons", 1925);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        List<Book> books = library.getBooks();
        System.out.println("After added: %s".formatted(books));
        
        library.deleteBook("123");
        books = library.getBooks();
        System.out.println("After deletion: %S".formatted(books));

        Book updatedBook = new Book("Pride and Prejudice", "1011", "Jane Austen", 4, "T. Egerton, Whitehall", 1813);
        library.updateBook("456", updatedBook);
        
        books = library.getBooks();
        System.out.println("After update: %s".formatted(books));
	}

}
