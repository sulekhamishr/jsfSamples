package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDao {

	
	public List<Employ> showEmploy()
	{
		
		
		List<Employ> employList = new  ArrayList<Employ>();
	
		
		employList.add(new Employ(1,"Nisha","Conduent","Developer",25000.0));
		employList.add(new Employ(2,"Raman","Trident","Sales",45000.0));
		employList.add(new Employ(3,"Raja","Conduent","Marketing",750000.0));
		employList.add(new Employ(4,"Rami","kokila_Modi","Marketing",750000.0));

		return employList;
		
	}
}
