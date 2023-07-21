package org.tnsif.operators;

public class IncrementDecrmentOperatorDemo {
	
	public static void main(String args[]) {
		int x=23;
		int y=6;
		int result1 =x++  + ++y;
		System.out.println(result1);
		System.out.println(x);
		System.out.println(y);
		
		int result2 = x-- + --y;
		System.out.println(result2);
		System.out.println(x);
		System.out.println(y);
		
	}
}
