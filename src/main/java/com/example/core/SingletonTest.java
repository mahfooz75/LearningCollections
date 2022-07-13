package com.example.core;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.hashCode());
		
		
		SingletonWithoutSyncronization s3=SingletonWithoutSyncronization.getInstance();
		System.out.println(s3.hashCode());
		
		SingletonWithoutSyncronization s4=SingletonWithoutSyncronization.getInstance();
		System.out.println(s4.hashCode());
	}

}
