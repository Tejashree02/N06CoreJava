//Program to demonstrate on to check if a person is eligible to donate the blood

//for comparing more than two conditions


package org.tnsif.decisionmacking;
import java.util.*;
public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Age1: ");
		int age1 = sc.nextInt();
		System.out.print("Enter the Age2: ");
		int age2 =  sc.nextInt();
		System.out.print("Enter the Age3: ");
		int age3 = sc.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println(age1+ " Age1 is Greater.");
		}
		else if(age2>age1 && age2>age3) {
			System.out.println(age2+ " Age2 is Greater.");
		}
		else {
			System.out.println(age3+ " Age3 is Greater.");
		}
		sc.close();
	}

}
