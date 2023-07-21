//Program for Relational-operator
package org.tnsif.operators;
import java.util.*;
public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int X=sc.nextInt();
		System.out.print("Enter the secound number: ");
		int Y= sc.nextInt();
		System.out.println("For bitwise & :" +(X&Y));
		System.out.println("For bitwise ! :"+(X|Y));
		System.out.println("For bitwise ^ :"+(X^Y));
		System.out.println("For bitwise << :" +(X<<Y));
		System.out.println("For bitwise >> :" +(X>>Y));
		sc.close();
		

	}

}
