package org.tnsif.thread;

public class Executor {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("IS "+Thread.currentThread().getName());
		
		ChildThread threadone = new ChildThread();
		ChildThread threadtwo = new ChildThread();
		System.out.println("IS "+threadone.getName()+" is Alive?"+threadone.isAlive());
		System.out.println("IS "+threadtwo.getName()+" is Alive?"+threadtwo.isAlive());
		
		threadone.join();
		threadtwo.join();
//		System.out.println("IS "+threadone.getName()+" is Alive?"+ threadone.isAlive());
//		System.out.println("IS "+threadtwo.getName()+" is Alive?"+ threadtwo.isAlive());
		System.out.println("________________________________________________");
	}

}
