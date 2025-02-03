package com.ics.test.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Runnable interface doesnot have run method to start a thread 
 * so we create a object and pass that object to Thread class;
 *  Thread class have run method that start the thread
 * */
@Component
public class Thread2 implements Runnable {
 
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			 
			System.out.println("t2");
		}

	}

}
