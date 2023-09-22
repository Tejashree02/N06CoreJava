package org.tnsif.threadsyncronization;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accobj= new Account(101,"Teju",1000);
		AccountThread threadone = new AccountThread(accobj);
		AccountThread threadtwo = new AccountThread(accobj);
		threadone.setAmount(2000);
		threadone.setType("withdraw");
		
		threadtwo.setAmount(8000);
		threadtwo.setType("withdraw");
		
		threadone.start();
		threadtwo.start();
		System.out.println(accobj);
		
		
		try {
			threadone.join();
			threadtwo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
