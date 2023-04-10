package com.edison.prac02less14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;

public class ReadPNGImage {

	public static void main(String[] args) {
		int[] pngSignature = { 137, 80, 78, 71, 13, 10, 26, 10 };
		byte[] ihdrSignature = { 73, 72, 68, 82 };

		String inputFile = "D:/Code_TeachingSubject/SavvycomCode/src/NO14_TH2/savvycom.png";

		try (InputStream inputStream = new FileInputStream(inputFile);) {
			int[] pngHeader = new int[8];

			// read first 8 bytes as PNG file signature
			for (int i = 0; i < 8; i++) {
				pngHeader[i] = inputStream.read();
			}

			if (!Arrays.equals(pngHeader, pngSignature)) {
				System.out.println("The file is NOT a PNG image");
				System.exit(-1);
			}

			// skip next 4 bytes (chunk data length)
			inputStream.skip(4);

			// read next 4 bytes as IHDR header chunk
			byte[] ihdrHeader = new byte[4];
			inputStream.read(ihdrHeader);

			if (!Arrays.equals(ihdrHeader, ihdrSignature)) {
				System.out.println("Invalid IHDR header");
				System.exit(-1);
			}

			// read next 4 bytes as the width value
			byte[] bytes = new byte[4];
			inputStream.read(bytes);
			int width = new BigInteger(bytes).intValue();

			System.out.println("Width = " + width);

			// read next 4 bytes as the height value
			inputStream.read(bytes);
			int height = new BigInteger(bytes).intValue();

			System.out.println("Height = " + height);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
