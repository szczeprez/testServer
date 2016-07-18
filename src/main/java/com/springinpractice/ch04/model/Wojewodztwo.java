package com.springinpractice.ch04.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Wojewodztwo implements Serializable{

	@Id
	@GeneratedValue
	private long id; 
	private String nazwa; 
	
	@OneToMany(mappedBy = "wojewodztwo")
	private List<Miejscowosc> miejscowosci;
	
	@OneToOne(mappedBy = "wojewodztwo")
	DanePodstawowe danePodstawowe; 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Miejscowosc> getMiejscowosci() {
		return miejscowosci;
	}

	public void setMiejscowosci(List<Miejscowosc> miejscowosci) {
		this.miejscowosci = miejscowosci;
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
		builder.append("Wojewodztwo [id=");
		builder.append(id);
		builder.append(", nazwa=");
		builder.append(nazwa);
		builder.append(", miejscowosci=");
		builder.append(miejscowosci);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((danePodstawowe == null) ? 0 : danePodstawowe.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((miejscowosci == null) ? 0 : miejscowosci.hashCode());
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
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
		Wojewodztwo other = (Wojewodztwo) obj;
		if (danePodstawowe == null) {
			if (other.danePodstawowe != null)
				return false;
		} else if (!danePodstawowe.equals(other.danePodstawowe))
			return false;
		if (id != other.id)
			return false;
		if (miejscowosci == null) {
			if (other.miejscowosci != null)
				return false;
		} else if (!miejscowosci.equals(other.miejscowosci))
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		return true;
	} 
	
}
