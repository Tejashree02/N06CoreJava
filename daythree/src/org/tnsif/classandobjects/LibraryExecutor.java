//Driver class
//program to demonstrate Constructors( default and parameterized)
package org.tnsif.classandobjects;

public class LibraryExecutor {

	public static void main(String[] args) {
		Library lib = new Library();
		Library lib1 = new Library(8,"Vishal Lichade","Java Programming",500);
		System.out.println(lib1);

	}

}
