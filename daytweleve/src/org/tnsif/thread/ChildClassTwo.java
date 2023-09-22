package org.tnsif.thread;

public class ChildClassTwo extends Thread{
	public void run() {
		System.out.println(ThreadOperation.isPrime(5));
	}

}
