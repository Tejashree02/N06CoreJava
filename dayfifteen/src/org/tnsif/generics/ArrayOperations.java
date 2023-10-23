package org.tnsif.generics;

import java.util.Arrays;

public class ArrayOperations {
	public static <E> void display(E values[]) {
//		for(int i=0;i<values.length;i++) {
//			System.out.println(values[i]+" ");
//		}
		for(E ele :values) {
			System.out.println(ele+"\t");
		}
	}

	public static <E> void sortArray(E values[]) {
		// TODO Auto-generated method stub
		Arrays.sort(values);
	}
}
