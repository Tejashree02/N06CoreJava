package org.tnsif.threadsyncronization;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException()
	{
		super("Cant Withdraw...");         // if you want fix message.
	}
	public InsufficientBalanceException(String message)                 // 
	{
		super(message);
	}

}

// all user define exception are checked exception
// arithmetic is unchecked exception

//class not found is an checked exception