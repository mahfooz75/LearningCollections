package com.example.override;

public class A extends Animal {

	@Override
	public void sleep() {
		System.out.println("A sleep");
	}

	public void eat() {
		System.out.println("A eat");
	}

	public void jump() {
		System.out.println("In A jump");
	}

}
