package oop;

public class ITBook extends Book {
	private String category;

	public ITBook() {
		super();
	}

	public ITBook(String title, int price, String category) {
		super(title, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ITBook [category=" + category + "]";
	}

}
