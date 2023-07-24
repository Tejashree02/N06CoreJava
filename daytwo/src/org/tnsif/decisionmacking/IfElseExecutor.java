//Program to demonstrate on to check if a person is eligible to donate the blood
package org.tnsif.decisionmacking;
import java.util.*;

public class IfElseExecutor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		System.out.print("Enter the Weigth: ");
		int weight = sc.nextInt();
		if(age >=18 && weight>=45) {
			System.out.println("Eligible to Donnate the Blood");
		}
		else {
			System.out.println("NOT Eligible to Donnate the Blood");
		}
		sc.close();
		}

}
