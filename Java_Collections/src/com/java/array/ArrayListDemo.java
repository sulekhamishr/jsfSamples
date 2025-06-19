package com.java.array;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
    ArrayList<Object> ar= new ArrayList<Object>();
    System.out.println(ar.size());//0
    ar.add(100);
    System.out.println(ar.size());//1
    ar.add(200);
    ar.add(300.5);
    ar.add("sg");
    System.out.println(ar.size()-1);//3
    System.out.println(ar);

	}
}
