//Driver class
//Program to demonstrate on class and objects
package org.tnsif.classandobjects;

public class EmployeeExecutor {

	public static void main(String[] args) {
//		Object creation	
		Employee e = new Employee();
		e.empid=132982;
		e.empName="Tejashree";
		e.salary=321456;
		e.department="Computer";
//		methodd call
		e.display();
		
	}

}
