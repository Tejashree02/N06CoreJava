package org.tnsif.thread;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first way-using implementable class 
		RunnableImpl impl=new RunnableImpl();
		Thread threadone = new Thread(impl);
		threadone.start();
		
		//secound way -  anonymous class
		// we cannot instantiate type runnable and abstract method
		Runnable obj= new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				char ch='A';
			for(int i=1;i<27;i++,ch++)
				
			{
				System.out.println(Thread.currentThread().getName()+" "+ch);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		};
		Thread threadtwo = new Thread(obj);
		threadtwo.start();
		
		Runnable objone=()->			//this logic will be for the run method without using public static 
		{
			for(int i=1000;i<=1050;i++)
				
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread threadthree = new Thread(objone);
		
//		threadone.start();
//		threadtwo.start();
		threadthree.start();
		
		System.out.println("__________________________________________");
		
		Thread.sleep(1200);
	}

}




//Threas.sleeep				it is static method
//thread.current name      it is static method
//thread.start()          it is a static method