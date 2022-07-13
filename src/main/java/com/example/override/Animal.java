package com.example.override;

public abstract class Animal {

	abstract public void sleep();

	public void eat() {
		System.out.println("Animal eat");
	}

	public void jump() {
		System.out.println("In jump");
	}
}
