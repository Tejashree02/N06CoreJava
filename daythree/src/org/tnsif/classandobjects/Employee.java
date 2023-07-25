//Program to demonstrate on class and objects
package org.tnsif.classandobjects;
//CLass declaration
public class Employee {
	//default access specifiers
	//default data members: inside the same package.
	int empid;
	String empName;
	float salary;
	String department;

//	Method declaration and definition
	void display() {
		System.out.println("EmpID: "+empid+" "+"\nEmpName: "+empName+" "+"\nSalary: "+salary+" "+"\nDepartment: "+department);
	}
}
