package com.edison.prac01less16;

import java.util.Scanner;

public class ExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		    
			System.out.print("Enter n: ");
			int n = sc.nextInt();
		
		
		Count cnt = new Count(n);
	      try
	      {
	         while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }
	}

}
