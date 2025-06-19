package com.java.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates_List {

	
	//Write a program to remove duplicates from a List using a Set.


	public static void main(String[] args)
	{
		
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Naveen");
		studentList.add("Steve");
		studentList.add("Lisa");
		
		System.out.println(studentList);
		
		Set<String> names= new  HashSet<>(studentList);
		
		List<String> uniqueNames = new ArrayList<>(names);
		
		System.out.println(uniqueNames);
		
		
		
	}
}
