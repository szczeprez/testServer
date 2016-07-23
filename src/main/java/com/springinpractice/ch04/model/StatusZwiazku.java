package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StatusZwiazku implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String typZwiazku;
 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypZwiazku() {
		return typZwiazku;
	}

	public void setTypZwiazku(String typZwiazku) {
		this.typZwiazku = typZwiazku;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((typZwiazku == null) ? 0 : typZwiazku.hashCode());
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
		StatusZwiazku other = (StatusZwiazku) obj;
		if (id != other.id)
			return false;
		if (typZwiazku == null) {
			if (other.typZwiazku != null)
				return false;
		} else if (!typZwiazku.equals(other.typZwiazku))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusZwiazku [id=");
		builder.append(id);
		builder.append(", typZwiazku=");
		builder.append(typZwiazku);
		builder.append("]");
		return builder.toString();
	}
	
 
  

}
