package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAndNonGeneric {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("Mahfooz");
		lst.add("Piyush");
		lst.add("Sanjaya");
		//lst.add(10);
		method1(lst);
		lst.add("Asanka");
		System.out.println(lst);
		for(String s:lst) {
			System.out.println(s);
		}
		
//		List lst1=new ArrayList<String>();
//		lst1.add(10);
//		lst1.add(10.5);
//		lst1.add(false);
//		System.out.println(lst1);
//		for(Object o:lst1) {
//			System.out.println(o);
//		}
	}

	private static void method1(List lst) {
		lst.add(10);
		lst.add(25.5);
		lst.add(true);
	}

}
