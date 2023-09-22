package org.tnsif.thread;

public class RunnableImpl implements Runnable{
		//run is the abstract method.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Hello");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
