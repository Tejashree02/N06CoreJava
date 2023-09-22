package org.tnsif.thread;

public class ChildThread extends Thread{
	
	public ChildThread() {
		
		setPriority(MAX_PRIORITY);
		start();
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Hello");
		System.out.println(Thread.currentThread().getName()+" is Alive?"+ currentThread().isAlive());
	}
}
