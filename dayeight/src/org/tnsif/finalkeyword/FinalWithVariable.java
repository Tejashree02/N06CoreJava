//program to demonstrate final keyword
package org.tnsif.finalkeyword;

public class FinalWithVariable {
//	final keyword should be initialize during declaration
	//final int x;
	
	final float SALARY=67000f;
	
	void  print() {
		//we cannot change the value of final variable
		System.out.println("Salary is: " +SALARY);
	}

}
