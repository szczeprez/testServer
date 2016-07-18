package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InteresujeMnie implements Serializable{

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((interesujeMnie == null) ? 0 : interesujeMnie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InteresujeMnie other = (InteresujeMnie) obj;
		if (id != other.id)
			return false;
		if (interesujeMnie == null) {
			if (other.interesujeMnie != null)
				return false;
		} else if (!interesujeMnie.equals(other.interesujeMnie))
			return false;
		return true;
	}

}
