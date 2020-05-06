package com.syntax.class34;

public class ThrowExample {
	public static void main(String[] args) {
		multipleSleep();
	}
	public static void read() {
		
	}
	public static void multipleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

}
