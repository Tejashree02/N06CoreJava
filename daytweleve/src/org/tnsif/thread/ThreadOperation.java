package org.tnsif.thread;

public class ThreadOperation {
	
	public static int getFactorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println("factorial Method "+Thread.currentThread());
		return fact;
		
	}
	public static boolean isPrime(int no) {
		boolean flag=true;
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				flag= false;
				break;
			}
			else 
			
				return true;
			
		}
		System.out.println("Prime Method "+Thread.currentThread());
		return flag;
	}
}
