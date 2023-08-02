//program to demonstrate on super keyword with varible

package org.superkeyworddemo;
class Building{
	String name="RoseVilla";
	int floors=23;
}
class Flat extends Building{
	void print() {
		
//	if parent class and child class variable name are same and if you want to access parent class variable 
//	inside child class use (super.variable name)
		System.out.println(super.name);
		System.out.println(name);
	}
	String name="Mr.Sharma";
	
}
public class SuperKeywordWithVaiable {

	public static void main(String[] args) {
		Flat f= new Flat();
		f.print();

	}

}
