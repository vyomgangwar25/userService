package com.ics.test.practice;

 
import org.springframework.stereotype.Component;

@Component
public class Thread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("t3");
		}
	}

}
