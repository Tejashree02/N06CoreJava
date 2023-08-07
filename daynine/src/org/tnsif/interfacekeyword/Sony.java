//program to demonstrate on an Interface.
package org.tnsif.interfacekeyword;

public interface Sony {
/* by default all the variables inside an interface if public static final.*/
	
	int noOfChannels=9;
	void display() ;// interface consist of only abstract method and abstract method don't have body.
	
	//Java 8 provides a static and default method inside an interfce.
	
	static void accept() {
		System.out.println("Static method");
	}
	//default  method
	default void show() {
		System.out.println("default method");
	}
}
