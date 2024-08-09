package proj;

public class BookService {
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			for(Author bookAuthor: book.authors) {
				if(bookAuthor.id == author.id) {
					temp[count++] = book;
				}
			}
		}
		Book result []= new Book[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		Book[] temp =new Book[books.length];
		int count =0;
		for(Book book: books) {
			if(book.publisher.id == publisher.id) {
				temp[count++]=book;
			}
		}
		Book result[] =new Book[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

	// methods keeps books with publishing year inclusively. 
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {

		Book temp[] =new Book[books.length];
		int count = 0;
		for(Book book : books) {
			if(book.publishingYear>=yearFromInclusively) {
				temp[count++]=book;
			}
		}
		Book result[] = new Book[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}
}
