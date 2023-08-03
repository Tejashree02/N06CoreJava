package org.tnsif.polymorphism;

class Bollywood{
	void showCouple(String str1, String str2) {
		System.out.println(str2+" loves "+str1);
	}
	void showCouple(String str1, String str2,String str3) {
		System.out.println(str2+" loves "+str1+" as well as "+str3);
	}
}
	

public class MethodOverloadingExecutor {
	
	public static void main(String args[]) {
		Bollywood b= new Bollywood() ;
		b.showCouple("salman","Aishwary" );
		b.showCouple("Saman", "Aishwary","katrina");
	}

}
