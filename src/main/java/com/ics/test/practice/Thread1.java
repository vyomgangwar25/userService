package com.ics.test.practice;

import org.springframework.stereotype.Component;

/**
 * 
 * the "start" method creates a new thread and initiates its execution by
 * calling the "run" method within that new thread, while directly calling "run"
 * does not create a new thread, instead executing the code within the current
 * thread
 */

/**
 * @Yield:this method pauses the currently executing thread temporarily for
 *             giving a chance to the remaining waiting threads of the same
 *             priority to execute.
 * @Join:The current thread can invoke join() on any other thread which makes
 *           the current thread wait for the other thread to die before
 *           proceeding.
 * 
 * @Sleep: this method stops the execution of current thread for specific
 *         interval of time
 */

@Component
public class Thread1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000); // sleep for 1 second
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

		System.out.println("t1");

	}
	}

 
