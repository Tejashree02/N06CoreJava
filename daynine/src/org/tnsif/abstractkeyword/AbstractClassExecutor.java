package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
//		Sandwich s = new Sandwich();  we cannot create the object for abstract class
		
		CheeseChilly cc= new CheeseChilly();
		cc.prepare();
		cc.showRecepie();
		cc.prepare(6);
		

	}

}
