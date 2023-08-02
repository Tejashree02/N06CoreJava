package org.superkeyworddemo;

class MET{
	String owner="Chagan Bhujbal";

	/*  */
	void  display() {
		System.out.println("Owner is: "+owner);

	}
}
class BKC extends MET{
	String owner="Shefali Bhujbal";
	void display() {
		super.display();				// use this if method name is same
		System.out.println("Owner is: "+owner);
	}
}
public class SuperKeywordWithMethod {
	
	public static void main(String args[]) {
		
		BKC b= new BKC();
		b.display();
		
	}

}
