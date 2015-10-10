package com.rohit;

public class AnonInner {
	public static void main(String args[]) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("My runnable inner class");
			}
		};
		
		r.run();
		
		Runnable r1 = () -> System.out.println("My lambda runnable");
		r1.run();
		
		//new AdapterLambda();
	}
}
