package com.edison.prac01less16;

public class Count extends Thread {
	private int n;

	public Count(int n) {
		super("my extending thread");
		System.out.println("my thread created" + this);
		this.n = n;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < n; i++) {
				System.out.println("Printing the count " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("My thread run is over");
	}

}
