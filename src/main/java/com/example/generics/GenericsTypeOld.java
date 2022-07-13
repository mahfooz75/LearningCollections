package com.example.generics;

import java.util.Set;

public class GenericsTypeOld {

	public static void main(String[] args) {
		OldStyle type = new OldStyle();
		type.set("Mahfooz");
		String str = (String) type.get();
		System.out.println(str);
		
		GenericStyle<String> genericType=new GenericStyle<>();
		genericType.set("Ahmad");
		String lastName=genericType.get();
		System.out.println(lastName);
		
	}

}

class OldStyle {
	private Object t;

	public Object get() {
		return this.t;
	}

	public void set(Object t) {
		this.t = t;
	}
}

class GenericStyle<T> {
	T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}
}
