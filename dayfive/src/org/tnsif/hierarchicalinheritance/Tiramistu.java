package org.tnsif.hierarchicalinheritance;

public class Tiramistu extends Android{

	private int version ;
	
	
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Tiramistu [version=" + version + ", toString()=" + super.toString() + "]";
	}


	public Tiramistu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

}
