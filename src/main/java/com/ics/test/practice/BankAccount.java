package com.ics.test.practice;

class BankAccount {
	private int balance = 1000;

	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + ", Balance: " + balance);
	}

	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
		} else {
			System.out.println("Insufficient balance to withdraw: " + amount);
		}
	}

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				account.deposit(200);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				account.withdraw(100);
				try {
					Thread.sleep(100); // some delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

//		// Wait for threads to finish
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// Print final balance
		System.out.println("Final Balance: " + account.getBalance());
	}
}