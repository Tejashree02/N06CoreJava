//Program to demonstrate user-input value
package org.tnsif.introduction;
import java.util.*; 

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str1=sc.next();				//Used to print the first word
		System.out.println("String is : "+str1);
		String str2=sc.nextLine();
		System.out.println("String is: "+str2);
	}
}
