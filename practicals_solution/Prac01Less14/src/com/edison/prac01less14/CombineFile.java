package com.edison.prac01less14;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CombineFile {
	private static final int BUFFER_SIZE = 10;
	public static void main(String[] args) throws IOException {
		 String inputFile1 = "D:/Code_TeachingSubject/SavvycomCode/src/N14_TH1/file1.txt";
	        String inputFile2 = "D:/Code_TeachingSubject/SavvycomCode/src/N14_TH1/file2.txt";
	        String outputFile = "D:/Code_TeachingSubject/SavvycomCode/src/N14_TH1/file3.txt";
	 
	        
	        FileInputStream inputStream1 = null;
	        FileInputStream inputStream2 = null;
	        FileOutputStream outputStream = null;
	 
	        try  {
	        	 
	             inputStream1 = new FileInputStream(inputFile1);
	             inputStream2 = new FileInputStream(inputFile2);
	             outputStream = new FileOutputStream(outputFile);
	        
	            byte[] buffer = new byte[BUFFER_SIZE];
	            int bytesRead = -1;
	 
	            while ((bytesRead = inputStream1.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }
	 
	            while ((bytesRead = inputStream2.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }
	        } finally {
	            if (inputStream1 != null) {
	            	inputStream1.close();
	            }
	            
	            if (inputStream2 != null) {
	            	inputStream2.close();
	            }
	            
	            
	            if (outputStream != null) {
	            	outputStream.close();
	            }
	        }
	}

}
