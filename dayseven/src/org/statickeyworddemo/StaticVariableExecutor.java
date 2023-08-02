package org.statickeyworddemo;

public class StaticVariableExecutor {
//	This is static variable.
	/* if any variable is outside  the main function and if you 
	 * want to access that variable inside the main function the, make the variable as static
	 */
	static String str="TNSIF";
	public static void main(String args[]) {
//		StaticVariableExecutor s = new StaticVariableExecutor();
//		System.out.println(s.str);
		System.out.println(str);
	}

}
