package com.example.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints=" + sum);
		
		List<Double> doubles = new ArrayList<>();
		doubles.add(3.5);
		doubles.add(5.5);
		doubles.add(10.5);
		sum = sum(doubles);
		System.out.println("Sum of doubles=" + sum);
		
		List<BigDecimal> bigDecimalList=new ArrayList<>();
		bigDecimalList.add(new BigDecimal(5));
		bigDecimalList.add(new BigDecimal(3.5));
		bigDecimalList.add(new BigDecimal(5.45));
		sum = sum(bigDecimalList);
		System.out.println("Sum of bigDecimalList=" + sum);
		
		List<Object> ll=new ArrayList<>();
		addIntegers(ll);
		System.out.println(ll);
		BigDecimal a =new BigDecimal(34);
		BigDecimal b =new BigDecimal(66);
		System.out.println(addition(a,b));
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void addIntegers(List<? super Integer> list){
		list.add(Integer.valueOf(50));
	}
	
	public static <T extends Number> double addition(T a, T b) {
		return a.doubleValue()+b.doubleValue();
	}

}
