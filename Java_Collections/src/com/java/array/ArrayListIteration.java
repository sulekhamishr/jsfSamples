package com.java.array;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Steve");
		studentList.add("Lisa");
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
	}
}
