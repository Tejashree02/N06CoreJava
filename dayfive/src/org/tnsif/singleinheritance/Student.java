//program to demonstrate Single inheritance.
package org.tnsif.singleinheritance;

public class Student extends Citizen {

	//private data members.
	private int rollno;
	private String collegeName;
	
	
	//getters and setters.
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//parameterized
	public Student(String city, int pincode, String area, long adharno,int rollno, String collegeName) {
		
		super(city, pincode, area, adharno);
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
