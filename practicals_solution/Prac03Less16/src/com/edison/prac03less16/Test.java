package com.edison.prac03less16;

public class Test {
	public static void main(String[] args) {
		Sender sender = new Sender();
		SendUsingThreads sender1 = new SendUsingThreads("Hello ", sender);
		SendUsingThreads sender2 = new SendUsingThreads("Welcome to Savvycom Tutorials ", sender);

		// Start two threads of SendUsingThreads type
		sender1.start();
		sender2.start();

		// wait for threads to end
		try {
			sender1.join();
			sender2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}

	}
}
