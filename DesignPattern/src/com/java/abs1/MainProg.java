package com.java.abs1;

public class MainProg {

	public static void main(String[] args) {
		
	String brand="Samsung";
	
	AbstractFactory factory = new MobileFactory();
    Mobile mobile = factory.getDetails(brand);

	
    if (mobile != null) {
        System.out.println(mobile.getClass().getSimpleName()); 
        mobile.name();
        mobile.model();
        mobile.price();
    } else {
        System.out.println("Mobile not found");
    }
}
}