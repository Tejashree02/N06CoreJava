//program to demonstrate on final method

package org.tnsif.finalkeyword;
//parent class


// final class cannot be inherit
//public class final Laptop{ }

public class Laptop {
	final String Processor="Intel I5";

	//final method
	final void display() {
		System.out.println(Processor);
	}
}
