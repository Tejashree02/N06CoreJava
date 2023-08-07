package org.tnsif.abstractkeyword;

public class CheeseChilly extends Sandwich {

	@Override
	void prepare() {
		System.out.println("Cheese Chilly Sandwich");
		
	}

	@Override
	void prepare(int x) {
		System.out.println(x);
		
	}
	

}
