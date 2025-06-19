package com.java.st;

public class SingletonExample {

	
	public static void main(String[] args) {
		Calculation obj1= Calculation.getInstance();
	    System.out.println("sum "+obj1.sum(12,5));
		System.out.println("sub "+obj1.sub(12,5));
		System.out.println("multi "+obj1.multi(12,5));

	}
}
