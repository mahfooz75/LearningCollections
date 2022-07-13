package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put(null, 2);
		map.put(null, 3);
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" >> "+entry.getValue());
		}
	
	}

}
