package org.tnsif.thiskeyworddemo;

class Director{
	String name;
	
	void print() {
		this.name="Sunil Datt";
		display(name);
	}
	void display(String Name) {
		System.out.println("Directopr name is : "+name);
	}
}

public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d= new Director();
		d.print();

	}

}
