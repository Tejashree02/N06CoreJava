package org.tnsif.generics;
import java.util.*;
public class UpperBoundWildCard {
	
	public static Double sumOfList(List<? extends Number> al) {
		 double sum=0.0;
		 for(Number n : al) {
			 sum=sum+n.doubleValue();
		 }
		 return sum;
	}

}
