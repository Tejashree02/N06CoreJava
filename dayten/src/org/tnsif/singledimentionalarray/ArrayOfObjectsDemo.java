// program to demonstrate on arrays of objects

//driver class
package org.tnsif.singledimentionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		Employees arr[] = new Employees[3];
		
		arr[0]=new Employees(110,"Tejashree",78000.45);
		arr[1]=new Employees(120,"Vibhuti",89000.45);
		arr[2]=new Employees(110,"Hrishikesh",98000.45);
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
	}

}
