//program to demonstrate the encapsulation
/*  Encapsulation achieves a data hiding using private access specifiers*/
package org.tnsif.encapsulation;

public class HDFC {

	//private data members.
	private String accType;
	private long accountNo;
	private long accCardNo;
	private int pinNo;
	
	//getters and setters methods
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAccCardNo() {
		return accCardNo;
	}
	public void setAccCardNo(long accCardNo) {
		this.accCardNo = accCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", accCardNo=" + accCardNo + ", pinNo=" + pinNo
				+ "]";
	}
	
	
}
