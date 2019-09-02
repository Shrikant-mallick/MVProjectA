package com.demo.core;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("A", 1);
		hm.put("B",2);
		hm.put(null, 3);
		hm.put(null,4);
		hm.put(null, null);
		hm.put("C", null);
		hm.put("E",null);
		hm.put("D", null);
		
		System.out.println(hm);
		System.out.println(hm.get("B"));
		System.out.println(hm.containsKey("B"));
		System.out.println(hm.containsValue(1));
		System.out.println(hm.keySet());
		System.out.println(hm.get(null));
		
	}

}
