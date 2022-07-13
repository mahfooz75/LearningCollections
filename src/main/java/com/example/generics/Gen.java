package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Gen<T extends Number> {

	public void operations(T a, T b) {
		System.out.println(a.doubleValue() + b.doubleValue());
		System.out.println(a.doubleValue() - b.doubleValue());
		System.out.println(a.doubleValue() * b.doubleValue());
		System.out.println(a.doubleValue() / b.doubleValue());
	}

	public static void main(String[] args) {
		new Gen<Integer>().operations(8, 4);

		List<Integer> l = new ArrayList<>();
		l.add(23);
		m(l);

		List<Double> l1 = new ArrayList<>();
		l1.add(455.5);
		m(l1);
	}

	private static void m(List<? extends Number> l) {
		for(Number obj:l) {
			System.out.println(obj);
		}
		
	}

}
