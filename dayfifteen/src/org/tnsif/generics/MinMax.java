package org.tnsif.generics;

public interface MinMax<T extends Comparable<T>> {
	
	T getMinimum();
	T getMaximum();

}
