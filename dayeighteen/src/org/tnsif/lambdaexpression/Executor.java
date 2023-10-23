package org.tnsif.lambdaexpression;

public class Executor {
	
	public static void main(String args[]) {

		Cube c = (no)-> no*no*no;
		System.out.println(c.getCube(4));
		
		
		Operations obj;
		
		obj=(x,y)->x+y;
		System.out.println(obj.performArithmetic(4, 8));
		
		obj=(x,y)->x-y;
		System.out.println(obj.performArithmetic(4, 8));
		obj=(x,y)->x*y;
		System.out.println(obj.performArithmetic(4, 8));
		obj=(x,y)->x/y;
		System.out.println(obj.performArithmetic(4, 8));
		obj=(x,y)->x%y;
		System.out.println(obj.performArithmetic(4, 8));
	}

}


