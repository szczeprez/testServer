package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sylwetka implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	private String typSylwetki;

	@OneToOne(mappedBy = "sylwetka")
	DanePodstawowe danePodstawowe;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypSylwetki() {
		return typSylwetki;
	}

	public void setTypSylwetki(String typSylwetki) {
		this.typSylwetki = typSylwetki;
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
		builder.append("Sylwetka [id=");
		builder.append(id);
		builder.append(", typSylwetki=");
		builder.append(typSylwetki);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((danePodstawowe == null) ? 0 : danePodstawowe.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((typSylwetki == null) ? 0 : typSylwetki.hashCode());
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
		Sylwetka other = (Sylwetka) obj;
		if (danePodstawowe == null) {
			if (other.danePodstawowe != null)
				return false;
		} else if (!danePodstawowe.equals(other.danePodstawowe))
			return false;
		if (id != other.id)
			return false;
		if (typSylwetki == null) {
			if (other.typSylwetki != null)
				return false;
		} else if (!typSylwetki.equals(other.typSylwetki))
			return false;
		return true;
	}
	
}
