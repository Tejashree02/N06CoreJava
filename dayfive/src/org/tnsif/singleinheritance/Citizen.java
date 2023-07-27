//program to demonstrate Single inheritance.
package org.tnsif.singleinheritance;
//base class
public class Citizen {
	
	//private data members .
	private String city;
	private int pincode;
	private String area;
	private long adharno;
	
	
	//getters and setters.
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	
	//to string.
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharno=" + adharno + "]";
	}
	//default Constructors.
	public Citizen() {
		System.out.println("Citizen-Parent-Class");
		
	}
	//parameterized Constructor.
	public Citizen(String city, int pincode, String area, long adharno) {
		super();			//Parent class name.
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharno = adharno;
	}
	
	
	
	
	
	
	

}
