package com.example.core;

public class SingletonWithoutSyncronization {
	
	private SingletonWithoutSyncronization() {}
	
	private static class HoldInstance{
		private static SingletonWithoutSyncronization INSTANCE=new SingletonWithoutSyncronization();
	}
	
	public static SingletonWithoutSyncronization getInstance() {
		return HoldInstance.INSTANCE;
	}
}
