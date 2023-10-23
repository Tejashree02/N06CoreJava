package org.tnsif.generics;

public class GenericConstruction {
	private double v;
	
	public <T extends Number>GenericConstruction(T t)
	{
		v=t.doubleValue();
	}
	void show() {
		System.out.println("Value of v in double type is: "+v);
	}

}
