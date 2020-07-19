package prototype;

import java.util.List;
import java.util.ArrayList;

public class BookShop implements Cloneable {
	public Author name;
	List<Book> books = new ArrayList<>();
	
	public Author getAuthor() {
		return name;
	}
	public void setAuthor(Author name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData(){
		for(int i=1;i<=10;i++) {
			Book book = new Book();
			book.setId(i);
			book.setName("book: "+i);
			this.getBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

	
}
