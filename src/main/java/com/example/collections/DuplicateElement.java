package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		String[] input= {"abc","efg","jkl","abc","mno","abc","jkl","efg","pqr","jkl","efg"};
		List<String> inputList=Arrays.asList(input);
		List<String> uniqueElement=new ArrayList<>();
		Set<String> dupUniqueElement=new HashSet<>();
		List<String> dupElement=new ArrayList<>();
		
		for(String str:inputList) {
			if(!uniqueElement.contains(str)) {
				uniqueElement.add(str);
			}else {
				dupElement.add(str);
				dupUniqueElement.add(str);
			}
		}
		System.out.println(uniqueElement);
		System.out.println(dupElement);
		System.out.println(dupUniqueElement);
		
//		List<String> ls = new ArrayList<String>();
//		List<Object> lo = ls;
//
//		ls.add("abc");
//		ls.add("xyz");
//		ls.add("pqr");
//		
//		
//		for(Object str : lo){
//		System.out.println(str);
//		}
	}

}
