package com.example.override;

class OverLoad{
	public void show(Object obj) {
		System.out.println("I am Object");
	}
	
	public void show(String str) {
		System.out.println("I am String");
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		OverLoad overLoad=new OverLoad();
		overLoad.show(null);
	}
}
