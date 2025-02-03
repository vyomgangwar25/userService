package com.ics.test.practice;

public class SynchronizationTest {
	private Integer count = 0;

	public   void setCount() {
		count = count + 1;
	}

	public   int getCount() {
		return count;
	}

	public static void main(String[] args) {
		SynchronizationTest obj = new SynchronizationTest();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				obj.setCount();
			}
		});
		Thread t2 = new Thread();
		for (int j = 0; j < 1000; j++) {
			obj.setCount();
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		/**
		 * in this case it will print any no because both thread try to increse the
		 * value of count at sane time .this may give different result everytime. to
		 * solve this problem either we use Join() or synchronization.
		 */

		/**
		 * when we use join method on t1 then first t1 will execute completely and then
		 * t2 start . when we use t2.join then t2 will execute completely and then print
		 * statement will execute so result is 2000
		 **/

		/**
		 * when we use synchronization on method level then only one thread will enter
		 * in method at a time and perform operation
		 * so result is 2000s
		 ***/
		System.out.println(obj.getCount());
	}

}
