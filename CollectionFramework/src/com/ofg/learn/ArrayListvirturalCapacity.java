package com.ofg.learn;

import java.util.ArrayList;

public class ArrayListvirturalCapacity {
	
	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println("Initial Physical Capacity" +ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println("Capacity" +ar.size());
	}

}
