package org.tnsif.multilevelinheritance;

public class ManagerExecutor extends OrganizationExecutor{
	
	private int Id;
	private int Salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	//to string
	@Override
	public String toString() {
		return "ManagerExecutor [Id=" + Id + ", Salary=" + Salary + ", toString()=" + super.toString() + "]";
	}
	//parameterized
	public ManagerExecutor(int orgId, String orgName, String area, int pincode,int Id,int Salary) {
		super(orgId, orgName, area, pincode);
		this.Id=Id;
		this.Salary=Salary;
		
	}
	
	
	
	
	

}
