package com.example.override;

public class Test {

	public static void main(String[] args) {
		Animal ax = new A();
		ax.eat();
		ax.sleep();
		ax.jump();
		System.out.println();
		Animal bx = new B();
		bx.eat();
		bx.sleep();
		bx.jump();
	}

}
