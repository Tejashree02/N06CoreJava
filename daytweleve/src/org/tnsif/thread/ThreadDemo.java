package org.tnsif.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Is main "+Thread.currentThread());
		
		ChildClassOne t1 =  new ChildClassOne();
		t1.start();
		t1.start();			//illegal thread state if started more than once without stoping the first state.
		ChildClassTwo t2 =  new ChildClassTwo();
		t2.start();
		try {
		t1.join();
		t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("_______________________________________________________");
		System.out.println("Factorial is "+ThreadOperation.getFactorial(4));
		System.out.println("prime or not "+ThreadOperation.isPrime(4));
	}

}
