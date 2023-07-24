//Program to demonstrate on Bunjee jumping using Nested if
package org.tnsif.decisionmacking;
import java.util.*;
public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = sc.nextInt();
		System.out.print("Enter the Weight: ");
		int weight = sc.nextInt();
		
		if(age>=12) {
			if(weight>=40) {
				System.out.println("Eligible for Bunjee Jumping .");
				if(weight>=110) {
					System.out.println("Extra Ropes will be added. ");
				}
				System.out.println("");
			}
			else {
				System.out.println("Not Eligible.");
			}
		}
		else {
			System.out.println("Not Eligible.");
		}
		sc.close();
	}

}
