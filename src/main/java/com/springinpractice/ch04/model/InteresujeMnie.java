package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InteresujeMnie {

	@Id
	@GeneratedValue
	private long id;
	
	private String interesujeMnie;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInteresujeMnie() {
		return interesujeMnie;
	}

	public void setInteresujeMnie(String interesujeMnie) {
		this.interesujeMnie = interesujeMnie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InteresujeMnie [id=");
		builder.append(id);
		builder.append(", interesujeMnie=");
		builder.append(interesujeMnie);
		builder.append("]");
		return builder.toString();
	}

}
