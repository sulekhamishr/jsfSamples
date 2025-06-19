package com.java.array;

import java.util.ArrayList;

//Write a Java program to store 5 student names using an ArrayList and display them.


public class student5 {

	public static void main(String[] args) {
		
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("annata");
		a.add("usha");
		a.add("sulu");
		System.out.println(a);
		for (String string : a) {
			System.out.println(string);
		}
	}
}
