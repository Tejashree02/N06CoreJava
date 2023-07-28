package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h= new HDFC();
		
		//setting values to private data members.
		h.setAccType("saving account");
		h.setAccountNo(435675467897L);
		h.setAccCardNo(123465347289L);
		h.setPinNo(2613);
		
		//getting values 
		System.out.println(h.getAccountNo());
		
		//call to string method
		System.out.println(h.toString());
	}

}
