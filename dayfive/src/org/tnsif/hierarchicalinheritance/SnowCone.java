package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android {

	
	private int version;
	
	
	public int getVersionId() {
		return version;
	}


	public void setVersionId(int version) {
		version = version;
	}


	@Override
	public String toString() {
		return "SnowCone [VersionId=" + version + ", toString()=" + super.toString() + "]";
	}


	public SnowCone(String brand, String slotType,int  version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

}
