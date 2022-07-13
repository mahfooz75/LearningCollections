package com.example.core;

public class Example3 {

	public static void main(String[] args) throws Exception {
		
		int x = 5, y = 1000;
		try {
			float z = (float) x / (float) y;
			if (z < 0.01) {
				throw new Exception("Number is too small");
			}
		} catch (Exception e) {
			System.out.println("Caught my exception ");
			throw e;
		} finally {
			System.out.println("I am always here");
		}

	}

}
