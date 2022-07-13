package com.example.override;

public class B extends Animal {

	@Override
	public void sleep() {
		System.out.println("B sleep");
	}

	public void eat() {
		System.out.println("B eat");
	}

	public void jump() {
		System.out.println("In B jump");
	}

	public void sleep(int x) {
		System.out.println("B's " + x);
	}

}
