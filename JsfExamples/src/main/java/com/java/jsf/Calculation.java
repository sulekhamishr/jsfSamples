package com.java.jsf;

import javax.faces.event.ActionEvent;

public class Calculation {
	
	private int firstNo;
	private int secondNo;
	private int result;
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Calculation [firstNo=" + firstNo + ", SecondNo=" + secondNo + ", result=" + result + ", getFirstNo()="
				+ getFirstNo() + ", getSecondNo()=" + getSecondNo() + ", getResult()=" + getResult() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Calculation(int firstNo, int secondNo, int result) {
		super();
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.result = result;
	}
	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addition(ActionEvent evt ) {
		 
		  this.result =this.firstNo+this.secondNo;
		
	}
	
	
   // Action event is a part of javax.faces.event package
}
