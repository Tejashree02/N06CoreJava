package org.superkeyworddemo;

class Google{
	String CEO;
	public Google(String CEO) {
		System.out.println("parameterized: "+CEO);
	}
}
class Gmail extends Google{
	String userid;
	public Gmail(String CEO, String userid) {
		super(CEO);
		this.userid=userid;
		System.out.println("UsderId: "+userid);
	}
}

public class SuperKeywordWithConstructor {
	public static void main(String args[]) {
		Gmail g=new Gmail("Sundar Pichai","abc@gmail.com");
		
	}
}
