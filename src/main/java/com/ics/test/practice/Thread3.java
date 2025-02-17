package com.ics.test.practice;

 
 

 
public class Thread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("create thread by extending thread class");
		}
	}
	public static void main(String[] args) {
		Thread3 t1=new Thread3();
		t1.start();
	}
	 

}
