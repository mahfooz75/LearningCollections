package com.example.core;

import java.util.Arrays;

class Car {
	public void run() {
		System.out.println("car is running");
	}
	public void color() {
		System.out.println("Car Color");
	}
}

class Audi extends Car {
	public void run() {
		System.out.println("Audi is running.");
	}

	public void color() {
		System.out.println("Red Audi");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Car b = new Audi();
		b.run();
		b.color();
		// How to call method color from base class instance.

	}
}
