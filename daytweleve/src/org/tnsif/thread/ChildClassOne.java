package org.tnsif.thread;

public class ChildClassOne extends Thread{
	public void run() {
		System.out.println(ThreadOperation.getFactorial(4));
	}

}
