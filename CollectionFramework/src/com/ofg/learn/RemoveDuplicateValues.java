package com.ofg.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValues {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> uniquelist=new ArrayList<Integer>(Arrays.asList(1,1,2,2,4,5,6,7,8,9,9,10,10));
	LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>(uniquelist);
	
	System.out.println(linkedHashset);
	
	ArrayList<Integer> uniquemarklist=new ArrayList<Integer>(Arrays.asList(1,1,2,2,4,5,6,7,8,9,9,10,10));
	List<Integer> list = uniquemarklist.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
