package hila;


public class Book {

	private String _name = "";
	private int    _pages = 0;
	private int _bookId = 0;
	private int _maxHoldingDays = 0;
	private Reader _currentReader = null;
	
	Book(String name, int Pages, int id, int maxHold){
		set_name(name);
		set_pages(Pages);
		set_bookId(id);
		set_maxHoldingDays(maxHold);
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_pages() {
		return _pages;
	}

	public void set_pages(int _pages) {
		this._pages = _pages;
	}

	public int get_bookId() {
		return _bookId;
	}

	public void set_bookId(int bookId) {
		this._bookId = bookId;
	}

	public int get_maxHoldingDays() {
		return _maxHoldingDays;
	}

	public void set_maxHoldingDays(int _maxHoldingDays) {
		this._maxHoldingDays = _maxHoldingDays;
	}

	public Reader get_currentReader() {
		return _currentReader;
	}

	public void set_currentReader(Reader _currentReader) {
		this._currentReader = _currentReader;
	}

}
