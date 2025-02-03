package com.ics.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Main class
 * @author Vyom Gangwar
 * @since 29-jan-2025
 * 
 * **/
@SpringBootApplication
public class TestProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);

	}
}


//	public void run() {
//
//		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println("The current thread name is: " + Thread.currentThread().getName());
//			} catch (Exception e) {
//				System.out.println("The exception has been caught: " + e);
//			}
//			System.out.println(i);
//		}
//	}


//		TestProjectApplication t1 = new TestProjectApplication();
//		TestProjectApplication t2 = new TestProjectApplication();
//		t1.start();
//
//		try {
////			t1.join();
//			t1.sleep(3000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		t2.start();

//		try {
//			 System.out.println("t2 execute");
//				t2.start();
//		} catch (InterruptedException e) {
//			 
//			e.printStackTrace();
//		}

//	@Autowired
//	private Thread1 thread1;
//
//	@Autowired
//	private Thread3 thread2;
//
//	// thread is a subpart of process
//	// example music player
//	// by extending thread class and by implementing runnable interface
//
//	@Override
//	public void run(String... args) throws Exception {
//		/**
//		 * Threads with higher priorities are given preference by the scheduler, but
//		 * thread priorities are only hints and not strict guarantees of execution
//		 * order.
//		 **/
//
//		System.out.println("state of thread before after creating--> " + thread1.getState());
//		thread1.setPriority(Thread.MAX_PRIORITY);
//		thread2.setPriority(Thread.MIN_PRIORITY);
//
////		thread1.start();
////		thread2.start();
////	
////		System.out.println("state of thread after start--->" + thread1.getState());
//
////		 Thread t2=new Thread(thread2);
////		 t2.start();
//		thread1.start();
//		thread2.start();
//
//		try {
//			System.out.println("Current Thread: " + Thread.currentThread().getName());
//			thread1.join();
//		}
//
//		catch (Exception ex) {
//			System.out.println("Exception has " + "been caught" + ex);
//		}
//
//	 
//	}
//
//}
