package com.ofg.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("SAM","BANU","SARVAN"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("SAM","BANU","SARVAN1"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		l2.removeAll(l1);
		System.out.println(l2);
		
		
		ArrayList<String> ll1 = new ArrayList<String>(Arrays.asList("C","C++","Java"));
		ArrayList<String> ll2 = new ArrayList<String>(Arrays.asList("C","C++","Physon"));
		
		ll1.retainAll(ll2);
		
		System.out.println(ll1);
		
	}
	
}

