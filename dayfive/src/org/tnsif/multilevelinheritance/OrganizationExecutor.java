package org.tnsif.multilevelinheritance;

public class OrganizationExecutor {
	
	private int orgId;
	private String orgName;
	private String area;
	private int pincode;
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "OrganizationExecutor [orgId=" + orgId + ", orgName=" + orgName + ", area=" + area + ", pincode="
				+ pincode + "]";
	}
	public OrganizationExecutor() {
		System.out.println("Organization-Parent-Class");
		// TODO Auto-generated constructor stub
	}
	public OrganizationExecutor(int orgId, String orgName, String area, int pincode) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.area = area;
		this.pincode = pincode;
	}
	
	
	
	

}
