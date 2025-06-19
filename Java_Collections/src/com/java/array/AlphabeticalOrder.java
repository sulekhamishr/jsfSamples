package com.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Write a program to sort an ArrayList of strings in alphabetical order.



public class AlphabeticalOrder {
	
	
	public static void main(String[] args) {
		
	
	List<String> a = new ArrayList<String>();
	a.add("ashish");
	a.add("kamya");
	a.add("bajaj");
	a.add("kant");
	//orignal List
	System.out.println(a);
	Collections.sort(a);
	
	//ascending
	System.out.println(a);
	
	//desending

	Collections.reverse(a);
	System.out.println(a);

	//desending
	Collections.sort(a, Collections.reverseOrder());

	System.out.println(a);
	}

}
