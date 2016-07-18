package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StatusZwiazku implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	private String typZwiazku;
	
	@OneToOne(mappedBy = "statusZwiazku")
	DanePodstawowe danePodstawowe; 

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
	

	public DanePodstawowe getDanePodstawowe() {
		return danePodstawowe;
	}

	public void setDanePodstawowe(DanePodstawowe danePodstawowe) {
		this.danePodstawowe = danePodstawowe;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((danePodstawowe == null) ? 0 : danePodstawowe.hashCode());
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
		if (danePodstawowe == null) {
			if (other.danePodstawowe != null)
				return false;
		} else if (!danePodstawowe.equals(other.danePodstawowe))
			return false;
		if (id != other.id)
			return false;
		if (typZwiazku == null) {
			if (other.typZwiazku != null)
				return false;
		} else if (!typZwiazku.equals(other.typZwiazku))
			return false;
		return true;
	}

}
