package hila;


public class Main {
	
	public static void main(String args[]){
		String names = args[0];
		String booksTitles = args[1];
		
		String[] namesArr = names.split(",");
		String[] titlesArr = booksTitles.split(",");
		
		Reader reader1 = new Reader(namesArr[0]);
		reader1.set_request(Request.BORROW);
		Reader reader2 = new Reader(namesArr[1]);
		reader2.set_request(Request.BORROW);
		
		Book book1 = new Book(titlesArr[0], 34, 1, 22);
		Book book2 = new Book("1984", 334, 2, 12);
		Book book3 = new Book("Pride and prejustice", 434, 3, 42);
		Book book4 = new Book("Fear and loat in Las Vegas", 314, 4, 32);
		
		Library library = new Library();
		library.add_freeBook(book1);
		library.add_freeBook(book2);
		library.add_freeBook(book3);
		library.add_freeBook(book4);
		
		library.addReaderToQueue(reader1);
		library.addReaderToQueue(reader2);
		
		library.handleReaders();
	}
}
