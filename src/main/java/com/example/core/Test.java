package com.example.core;

public class Test extends Thread implements Runnable{

	public void run() {
		System.out.printf("GFG ");
	}
	
	public static void main(String[] args) {
		Test obj=new Test();
		obj.run();
		obj.start();
	}

}
