package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plec {

	@Id
	@GeneratedValue
	private long id;
	
	private String plec;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Plec [id=");
		builder.append(id);
		builder.append(", plec=");
		builder.append(plec);
		builder.append("]");
		return builder.toString();
	}

}
