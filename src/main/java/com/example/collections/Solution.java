package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
		int [] a= {1,2,4,4,8,7,2};
		int max=solutions(a);
		System.out.println(max);
	}

	private static int solutions(int[] A) {
		if(A.length>100000) {
			return 0;
		}
		int retVal=0;
		Map<Integer, Integer> map=new HashMap<>();
		int count=1;
		for(int x:A) {
			if(map.containsKey(x)) {
				int val=map.get(x);
				map.put(x, ++val);
			}else {
				map.put(x, count);
			}
		}
		
		List<Integer> result=new ArrayList<>();
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getKey()==entry.getValue()) {
				result.add(entry.getKey());
			}
		}
		if(!result.isEmpty()) {
			retVal = Collections.max(result);
		}
		
		return retVal;
	}

}
