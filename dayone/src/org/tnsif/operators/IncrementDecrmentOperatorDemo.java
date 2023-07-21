//Program for Increment and Decrement-operator


package org.tnsif.operators;

public class IncrementDecrmentOperatorDemo {
	
	public static void main(String args[]) {
		int x=23;
		int y=6;
		int result1 =x++  + ++y;
		System.out.println("Result1: " +result1);
		System.out.println(x);
		System.out.println(y);
		
		int result2 = x-- + --y;
		System.out.println("Result2: " +result2);
		System.out.println(x);
		System.out.println(y);
		
	}
}
