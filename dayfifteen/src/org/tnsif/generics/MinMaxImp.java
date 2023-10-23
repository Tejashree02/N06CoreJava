package org.tnsif.generics;

public class MinMaxImp <T extends Comparable<T>>implements MinMax {

	T[] values;
	
	MinMaxImp(T[] obj){
		values = obj;
	}
	
	@Override
	public T getMinimum() {
		// TODO Auto-generated method stub
		T min = values[0];
		for(int  i=1;i<values.length;i++) 
			if(values[i].compareTo(min)<0) 
				min= values[i];
				return min;
	}

	@Override
	public T getMaximum() {
		T max = values[0];
		for(int  i=1;i<values.length;i++) 
			if(values[i].compareTo(max)>0) 
				max= values[i];
				return max;
	}
	
	

}
