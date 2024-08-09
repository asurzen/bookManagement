package proj;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
	public int id;
	public String name;
	public Author[] authors;
	public Publisher publisher;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;
	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,  BigDecimal price, CoverType coverType) {
		this.id=id;
		this.name =name;
		this.authors=authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
		
	}
	@Override
	public String toString() {
	    return "Book{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", authors=" + Arrays.toString(authors) +
	            ", publisher=" + publisher +
	            ", publishingYear=" + publishingYear +
	            ", amountOfPages=" + amountOfPages +
	            ", price=" + price +
	            ", coverType=" + coverType +
	            '}';
	}

}
