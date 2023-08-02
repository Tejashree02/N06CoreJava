package org.statickeyworddemo;

class Employee{
	private int empid;
	private String empName;
	private static String Companyname="TNSIF";
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static String getCompanyname() {
		return Companyname;
	}
	public static void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	
	public void display() {
		System.out.println("EMpId: "+this.getEmpid()+" "+"EmpName: "+this.getEmpName()+" "+"Compnany name: "+this.getCompanyname()+" ");
		
	}
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", empName=" + empName + "]";
//	}
		//we cannot override static keyword.
}
//driver class

public class StaticVariable {

	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.setEmpid(1);
		e.setEmpName("Shiwani");
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpid(4);
		e1.setEmpName("Mansi");
		e1.display();
				
	}

}
