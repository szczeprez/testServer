package com.springinpractice.ch04.domain;

public class City {
	
	private String value; 
	private String desctription; 
	
	public City() {
	}

	public City(String value, String desctription) {
	 
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
	public String toString() {
		return "City [value=" + value + ", desctription=" + desctription + "]";
	}
	
	

}
