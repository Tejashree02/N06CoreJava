package org.tnsif.thiskeyworddemo;


	class Bank
	{
		long AccountNo;
		Bank(long AccountNo){
			
			this.AccountNo=AccountNo;
			
		}
		void display() 
		{
			System.out.println(AccountNo);
		}
	
		
	}
	public class ThisKeywordTwo {
	public static void main(String[] args) {
		Bank b = new Bank(5673829847L);
		b.display();
	}

}
