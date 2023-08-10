package org.tnsif.wrapperclass;
//program to demonstrate on Auto-boxing .
//autoboxingL conversion of primitive to object

public class AutoBoxing {

	public static void main(String[] args) {
		int num=97;
		
//		converting primitive type to object.
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
