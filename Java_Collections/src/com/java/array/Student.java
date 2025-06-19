package com.java.array;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Student() {  // deafult constructor helps to create object  , 
		//if i want create objects without arguments.


		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}



public static void main(String[] args) {
	Student a= new Student();       //uses default constructor
	Student s2 = new Student("John");  // uses parameterized constructor
	System.out.println(a.getName());
	System.out.println(s2.getName());
	//here we we giving the name
    a.setName("org");
    s2.setName("nothing");
    
    //here we acess it safely
	System.out.println(a.getName());
	System.out.println(s2.getName());



}
	
	
	
	
}
