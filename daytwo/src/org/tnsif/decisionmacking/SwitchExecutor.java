//Program to demonstrate on a caller-tune using Switch
package org.tnsif.decisionmacking;
import java.util.*;
public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Song number: ");
		int songno = sc.nextInt();
		switch(songno) {
		case 1: 
			System.out.println("Waka Waka.");
			break;
			
		case 2:
			System.out.println("Taki Taki.");
			break;
			
		case 3:
			System.out.println("Jai Shree Ram.");
			break;
			
			default:
				System.out.println("Invalid Input.");
		}
	}

}
