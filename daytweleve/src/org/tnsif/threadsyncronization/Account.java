package org.tnsif.threadsyncronization;

public class Account implements Bank {

	private int accno;
	private String name;
	private int balance;
	
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public synchronized void deposite(int amount) throws DepositeLimitExceedsException {
		// TODO Auto-generated method stub
		
		if(amount>Bank.DEPOSITE_LIMIT) 
				throw new DepositeLimitExceedsException("cant't deposite "+amount+" ");
		balance+=amount;
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		if(amount>balance-Bank.MINIMUM_BALANCE)
			throw new InsufficientBalanceException("can;t withdraw "+amount+" Insufficient balance");
		
	}

}
