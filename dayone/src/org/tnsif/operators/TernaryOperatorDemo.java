//Program for Bitwise-operator

package org.tnsif.operators;
import java.util.*;
public class TernaryOperatorDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  num=sc.nextInt();
		String result=(num%2==0)? "Even":"False";
		System.out.println("Result is: "+result);
		sc.close();
	}

}
