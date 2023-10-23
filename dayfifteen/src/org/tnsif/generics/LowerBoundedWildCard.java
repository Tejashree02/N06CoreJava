package org.tnsif.generics;
import java.util.*;
public class LowerBoundedWildCard {
	public static void displayNumbers(List <? super Integer >list ) {
		for(Object n: list) {
			System.out.println(n);
		}
	}
}


//arrays.aslist(array name)        to convert array into list