package proj;

import java.math.BigDecimal;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[] {
				new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

				new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

				new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),


				new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };
		BookService bookService = new BookService();
		Author author = new Author(1,"Jon","Johnson");
		Publisher publisher = new Publisher(1,"Publisher_1");
        // Filter books by author
        Book[] booksByAuthor = bookService.filterBooksByAuthor(author, books);
        System.out.println("Books by author " + author.firstName + " " + author.lastName + ":");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        // Filter books by publisher
        Book[] booksByPublisher = bookService.filterBooksByPublisher(publisher, books);
        System.out.println("\nBooks published by " + publisher.publisherName + ":");
        for (Book book : booksByPublisher) {
            System.out.println(book);
        }

        // Filter books by year
        int year = 1995;
        Book[] booksAfterYear = bookService.filterBooksAfterSpecifiedYear(year, books);
        System.out.println("\nBooks published after " + year + ":");
        for (Book book : booksAfterYear) {
            System.out.println(book);
        }

	}
}
