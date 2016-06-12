package com.springinpractice.ch04.domain;

public class Wojewodztwo {
	
	private String value; 
	private String desctription; 
	
	public Wojewodztwo() {}

	public Wojewodztwo(String value, String desctription) {
	   this.value = value; 
	   this.desctription = desctription; 
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDesctription() {
		return desctription;
	}

	public void setDesctription(String desctription) {
		this.desctription = desctription;
	}

	@Override
	public java.lang.String toString() {
		return "Wojewodztwo [value=" + value + ", desctription=" + desctription + "]";
	}


	
	


}
