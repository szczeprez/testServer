package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plec implements Serializable{

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((plec == null) ? 0 : plec.hashCode());
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
		Plec other = (Plec) obj;
		if (id != other.id)
			return false;
		if (plec == null) {
			if (other.plec != null)
				return false;
		} else if (!plec.equals(other.plec))
			return false;
		return true;
	}

}
