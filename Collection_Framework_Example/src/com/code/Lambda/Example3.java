package com.code.Lambda;

/*
 * Creating thread using Runnable interface 
 */
public class Example3 {

	public static void main(String[] args) {
		
		//old way of creating thread 
		
		Runnable  runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("thread 1 is started");
				
			}
			
		};
		// creating thread class object 
		Thread  thread = new Thread(runnable);
		thread.start();
		
		
		//using lambda expression 
		
		Runnable runnable1 = () -> System.out.println("thread 2 is started");
		Thread thread2 = new Thread(runnable1);
		thread2.start();
		
		
		// more optimization
		new Thread(()->System.out.println("thread 3 started")).start();
	}

}
