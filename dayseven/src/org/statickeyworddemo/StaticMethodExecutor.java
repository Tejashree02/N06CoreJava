package org.statickeyworddemo;

public class StaticMethodExecutor {
	
	static float percent=9.8f;
	
	// static method 
	/*  if any method outside the main function and if you want to access the method inside the main function
	 *  make it as static*/
	static void displayScore(int score) {
		System.out.println("Score is :" +score);
		
		//we cannot print non static variables inside static method.
		System.out.println(percent);
	}

	public static void main(String[] args) {
		displayScore(56);
	}

}
