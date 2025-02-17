package com.ics.test.practice;

 

/**
 * Runnable interface doesnot have run method to start a thread so we create a
 * object and pass that object to Thread class; Thread class have run method
 * that start the thread
 */

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("create thread by runnable interface..");
		}

	}

	public static void main(String[] args) {
		Thread2 obj = new Thread2();
		Thread t = new Thread(obj);
		t.start();
	}

}
