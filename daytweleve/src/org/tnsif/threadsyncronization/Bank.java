package org.tnsif.threadsyncronization;
// interface contains abstract methods.

//in interface the fields are by default static and final
public interface Bank {
	
	 int DEPOSITE_LIMIT = 25000;					// static gives it italic and final bold's it
	 static final int MINIMUM_BALANCE = 1000;

	 	void deposite(int amount)throws DepositeLimitExceedsException;
	 	void withdraw(int amount)throws InsufficientBalanceException;
}