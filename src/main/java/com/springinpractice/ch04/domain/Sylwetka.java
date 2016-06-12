package com.springinpractice.ch04.domain;

public class Sylwetka {
	int id;
	String typ;
	
	public Sylwetka() {}

	public Sylwetka(int id, String typ) {
		super();
		this.id = id;
		this.typ = typ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
}
