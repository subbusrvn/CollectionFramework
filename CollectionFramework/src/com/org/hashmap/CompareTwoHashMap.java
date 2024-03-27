package com.org.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		map3.put(5, "E");
		map3.put(6, "E");
		
		System.out.println(map1.equals(map3));
		System.out.println(map1.equals(map2));
		
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		//combine the keys from both the maps: using HashSet
		
		HashSet<Integer> combineKeys = new HashSet<>();
		combineKeys.addAll(map3.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);	
		
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		map3.put(5, "E");
		map3.put(6, "E");
		
		System.out.println(new ArrayList<>(map3.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
		
		
		System.out.println(new HashSet<>(map3.values()).equals(new HashSet<>(map3.values())));
		
	}
	
}
