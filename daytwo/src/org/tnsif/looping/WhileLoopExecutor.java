package org.tnsif.looping;
import java.util.*;
public class WhileLoopExecutor {
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter th number: ");
	int number =sc.nextInt();
	while(number>0) {
		System.out.print(number+" ");
		number--;
	}
}
}
