//abstract method.
package org.tnsif.abstractkeyword;

public abstract class Sandwich {
	
	void showRecepie() {
		System.out.println("I don't know how to prepare sandwich");
	}
	abstract void prepare();
	abstract void prepare(int x);

}
