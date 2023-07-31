//program to demonstrate on:
//this keyword is used to refer current instance of the class
package org.tnsif.thiskeyworddemo;

class Account{
		long AccountNo;
		void setData(long AccountNo) {
			this.AccountNo=AccountNo;
		}
		void display() {
			System.out.println(AccountNo);
		}
}

public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a= new Account();
		a.setData(647635829L);
		a.display();
	}

}
