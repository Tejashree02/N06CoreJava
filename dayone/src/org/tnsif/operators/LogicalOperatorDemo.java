//Program for Logical-operator
package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(31!=7 && 3>=5);
		System.out.println(31!=7 || 3>=5);
		System.out.println(!(31!=7 || 3>=5));
	}

}
