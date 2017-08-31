package hila;

public class Reader {
	private String _name = "";
	private Book _currenBook = null;
	private Request _request;
	
	Reader(String name){
		set_name(name);
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Book get_currenBook() {
		return _currenBook;
	}

	public void set_currenBook(Book _currenBook) {
		this._currenBook = _currenBook;
	}

	public Request get_request() {
		return _request;
	}

	public void set_request(Request _request) {
		this._request = _request;
	}
}
