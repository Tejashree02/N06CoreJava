//program to demonstrate Constructors( default and parameterized)
package org.tnsif.classandobjects;
//class declaration
public class Library {
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	public Library() {
		System.out.println("default constrctor");
	}
	
//	parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parametrized Constructor");
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}

	
	
	
	
	
}
