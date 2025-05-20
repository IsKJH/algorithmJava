package oop;

import java.util.List;

public class BookMgr {
	private List<Book> booklist;

	public void addBook(Book book) {
		booklist.add(book);
	}

	public void print() {
		for (Book book : booklist) {
			System.out.println("책제목: " + book.getTitle() + ", 가격: " + book.getPrice());
		}
	}

	public BookMgr(List<Book> booklist) {
		super();
		this.booklist = booklist;
	}

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}

	@Override
	public String toString() {
		return "BookMgr [booklist=" + booklist + "]";
	}

}
