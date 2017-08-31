package hila;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;


public class Library {
	
	private Queue<Reader> 	   _readersQueue = new LinkedList<Reader>();
	private Map<Integer, Book> _freeBooks = new HashMap<Integer, Book>();
	private Map<Integer, Book> _OccupiedBooks = new HashMap<Integer, Book>();
	
	public void handleReaders(){
		while(!_readersQueue.isEmpty()){
			Reader reader = _readersQueue.poll();
			
			switch(reader.get_request()){
			case BORROW:{
				Book book = chooseBook();
				reader.set_currenBook(book);
				
				System.out.println(reader.get_name() + " is now reading " + book.get_name());
				break;
			}
			case RETURN:{
				Book book = reader.get_currenBook();
				reader.set_currenBook(null);
				add_freeBook(book);
				break;
			}
			}
			
			
		}
	}

	private Book chooseBook(){
		
		Book book = null;
		
		if(_freeBooks.isEmpty()){
			return null;
		}		

		Random generator = new Random();
		Object[] values = _freeBooks.values().toArray();
		book = (Book)values[generator.nextInt(values.length)];
		
		remove_freeBook(book);
		add_OccupiedBook(book);
		
		return book;
	}
	
	public void addReaderToQueue(Reader reader) {
		_readersQueue.add(reader);
	}

	public void add_freeBook(Book book) {
		_freeBooks.put(book.get_bookId(), book);
	}
	
	public void remove_freeBook(Book book) {
		_freeBooks.remove(book);
	}

	public void add_OccupiedBook(Book occupiedBook) {
		_OccupiedBooks.put(occupiedBook.get_bookId(), occupiedBook);
	}
	
	public void remove_occupiedBook(Book book) {
		_OccupiedBooks.remove(book);
	}
}
