package org.tnsif.threadsyncronization;

public class DepositeLimitExceedsException extends Exception {

	public DepositeLimitExceedsException() {
		super("cant deposite! ");
		
	}
	public DepositeLimitExceedsException(String message) {
		super();
		
	}
}
