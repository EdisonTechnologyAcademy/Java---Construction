package com.edison.prac02less16;

public class RunMyThread {

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		Thread t = new Thread();
		t.start();
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
