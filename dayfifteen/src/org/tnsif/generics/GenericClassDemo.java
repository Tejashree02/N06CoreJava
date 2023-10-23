
package org.tnsif.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repo<Integer> ObjOne= new Repo<Integer>();
		ObjOne.setData(10);
		System.out.println(ObjOne.getData());
		
		Repo<String> ObjTwo = new Repo<String>();
		ObjTwo.setData("java");
		System.out.println(ObjTwo.getData());
		
		Repo<Student> Objthree = new Repo<Student>();
		Objthree.setData(new Student(101,"abc",22));
		System.out.println(Objthree.getData());
	}

}
