package org.tnsif.instanceofdemo;

	class RBI{
		protected String ifsccode="RATN0000069"; 
	}
	class SBI extends RBI{
		public SBI() {
			
			super.ifsccode="RATN0000069";
			String ifsccode="SBIN0001469";
			System.out.println(ifsccode);
			//if parent class and child class have the same variable name in such case use super.
//			variable name to access that variable of parent class inside the child class.
			System.out.println(super.ifsccode);
		}
		}
	
//program to demonstrate (instanceof) operator
	public class InstanceOfDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
	}

}
