package com.edison.prac03less10;

public class TestPoint2DPoint3D {

	public static void main(String[] args) {
		  /* Test Point2D */
	      // Test constructors and toString()
	      Point2D p2a = new Point2D(1, 2);
	      System.out.println(p2a);  // toString()
	        	  
	      
	      Point3D p3a = new Point3D(21,22,23);  // default constructor
	      System.out.println(p3a);
	      
	      p2a = new Point3D(1,2,3);  // upcasting  
	      System.out.println(p2a);	      
	}

}
