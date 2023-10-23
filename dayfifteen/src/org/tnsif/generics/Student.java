package org.tnsif.generics;

public class Student {
	
	private int id;
	private String name;
	private float per;
	public Student( int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	

}
