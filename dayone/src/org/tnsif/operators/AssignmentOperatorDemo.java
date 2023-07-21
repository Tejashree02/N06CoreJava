//Program for Assignment-operator
package org.tnsif.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		int num1=4;
		int num2=num1;
		System.out.println(num2);
		num1*= num2;
		System.out.println(num1);
		num1+=num2;
		System.out.println(num1);

	}

}
