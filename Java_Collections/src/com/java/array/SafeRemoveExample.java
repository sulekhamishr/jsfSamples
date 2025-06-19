package com.java.array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafeRemoveExample {
	
	
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jake");

        Iterator<String> iterator = names.iterator();
        
        while (iterator.hasNext()) {
        	
        	
            String name = iterator.next();
            if (name.startsWith("J")) {
                iterator.remove(); 
                
                
            }
        }
        System.out.println("After removal: " + names);  
    }
}
