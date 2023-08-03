package org.tnsif.polymorphism;
class CM{
	void corruption(int amount1) {
		System.out.println("Corruption is : "+amount1);
	}
}
class MLA extends CM{
	void corruption(int amount2) {
		corruption(400000);
		System.out.println("Corruption amount is: "+amount2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA m=  new MLA();
		m.corruption(7000000);
	
	

	}

}
