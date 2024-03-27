package com.ofg.learn;

import java.util.ArrayList;

public class ArrayListConcept {
	
	//ArrayList is the Class
	public static void main(String[] args) {
		
	
	
	ArrayList<Object> ar= new ArrayList<Object>();
	ar.add(100);
	ar.add(200);
	ar.add("SAm");
	ar.add("S");
	ar.add(20.20);
	ar.add(true);
	
	System.out.println(ar.get(0));
	System.out.println(ar.size());
	System.out.println(ar.get(0));
	System.out.println("Highest Size of Array List" + (ar.size()-1));
	
	ar.add(400);
	ar.add(500);
	
	System.out.println(ar.size());
	
}

	
}