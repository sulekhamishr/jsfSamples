package com.java.array;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


//remove all element stating from j
public class ConcurrentModificationExc {

	
	    public static void main(String[] args) {
	    	
	    	List<String> names = new CopyOnWriteArrayList<>();
	        names.add("John");
	        names.add("Jane");
	        names.add("Jake");
	        names.add("Alex");
	        
	        
	        for (String name : names) {
				
	            if (name.startsWith("J")) {
		                names.remove(name);  
		            }
	        		
			}

	   
	        System.out.println(names);  
	    }
	}


