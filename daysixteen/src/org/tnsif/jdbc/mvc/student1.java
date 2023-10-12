package org.tnsif.jdbc.mvc;

public class student1 {
	private int Rollno;
	private String Name;
	private int Per;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPer() {
		return Per;
	}
	public void setPer(int per) {
		Per = per;
	}
	public student1(int rollno, String name, int per) {
		super();
		Rollno = rollno;
		Name = name;
		Per = per;
	}
	public student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student1 [Rollno=" + Rollno + ", Name=" + Name + ", Per=" + Per + "]";
	}

}
