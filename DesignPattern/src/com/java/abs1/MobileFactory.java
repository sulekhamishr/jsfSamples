package com.java.abs1;

import com.java.abs.JavaTraining;

public class MobileFactory  extends AbstractFactory{

	@Override
	public Mobile getDetails(String brand) {
		// TODO Auto-generated method stub
		
		if(brand.equals("Iphone")) {
			return new IPhone();
			
			}
			
			if(brand.equals("OnePlus")) {
			return new OnePlus ();
			
			}
			
			if(brand.equals("Samsung")) {
			return new Samsung();
			
			}


			return null;
	}

}
