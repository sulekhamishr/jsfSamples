package com.java.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapp {

	
	
	//Write a program to count how many times each word appears in a given list using a HashMap.

	
	public static void main(String[] args) {
		
		
	List<String> a= new ArrayList<String>();
	a.add("amirkant");
	a.add("ravikant");
	a.add("amaarkant");
	a.add("suryakant");
	a.add("amirkant");
	a.add("chandrakant");

	System.out.println(a);
	
	HashMap<String, String> wordCount= new HashMap<>();
	
	
	for (String word : a) {
		if(wordCount.containsKey(word));
		System.out.println(wordCount.get(word)+1);
		
	}
	
	

		
		
	}

	
	//concurrentHashMap 
}
