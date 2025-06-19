package com.java.array;

import java.util.HashSet;

public class HashSettt {
	
	
	
	//Write a Java program to create a HashSet of integers and check if a particular number exists.

public static void main(String[] args) {
	
	HashSet<Integer> a = new HashSet<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	System.out.println(a);
	System.out.println(a.contains(1));// checks if a number exits not
	
}

}
