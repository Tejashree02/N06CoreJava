
//Program for Arithmetic-operator
package org.tnsif.operators;
import java.util.*;
public class ArithmeticOperatorDemo {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter the Secound number: ");
	int num2 =sc.nextInt();
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	System.out.println(num1%num2);
	sc.close();
	}

}
