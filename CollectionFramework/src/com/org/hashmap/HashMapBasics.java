package com.org.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//no order - no indexing
		//store values -->Key-Value<-- <K,V>
		//Key Can be duplicate. But it won't print in the list.
		// It can store number of null values and one null key
		//Hashmap is not thread safe and un-synchronised 
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London UK");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "Berlin New");
		capitalMap.put("Russia", null);
		capitalMap.put("Russia", null);

//		System.out.println(capitalMap.get("USA"));
//		System.out.println(capitalMap.get("UK"));
//		System.out.println(capitalMap.get(null));
//		System.out.println(capitalMap.get("Russia"));
//		
		//iterator.
		 Iterator<String> it = capitalMap.keySet().iterator();
		 
		 while(it.hasNext()) {
			 String key = it.next();
			 String values= capitalMap.get(key);
			 
			 System.out.println("Key: " +key + "***" +"Value: " +values);
		 }
		 
		 
		//Iterator Entryset
		 
		 Iterator<Entry<String, String>> entryIT = capitalMap.entrySet().iterator();
		 
		 while(entryIT.hasNext()) {
			 Entry<String, String> entry= entryIT.next();
			 System.out.println("Key is: " +entry.getKey()+ " and Value is: " +entry.getValue());
			 
		 }
		
		
		
	}
	
}