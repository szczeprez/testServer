package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Miejscowosc implements Serializable{

	@Id
	@GeneratedValue
	private long id; 
	private String nazwa_miejscowosci; 
	
	@ManyToOne
	@JoinColumn(name = "woj_id")
	private Wojewodztwo wojewodztwo;
 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa_miejscowosci() {
		return nazwa_miejscowosci;
	}

	public void setNazwa_miejscowosci(String nazwa_miejscowosci) {
		this.nazwa_miejscowosci = nazwa_miejscowosci;
	}

	public Wojewodztwo getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(Wojewodztwo wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nazwa_miejscowosci == null) ? 0 : nazwa_miejscowosci.hashCode());
		result = prime * result + ((wojewodztwo == null) ? 0 : wojewodztwo.hashCode());
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
		Miejscowosc other = (Miejscowosc) obj;
		if (id != other.id)
			return false;
		if (nazwa_miejscowosci == null) {
			if (other.nazwa_miejscowosci != null)
				return false;
		} else if (!nazwa_miejscowosci.equals(other.nazwa_miejscowosci))
			return false;
		if (wojewodztwo == null) {
			if (other.wojewodztwo != null)
				return false;
		} else if (!wojewodztwo.equals(other.wojewodztwo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Miejscowosc [id=");
		builder.append(id);
		builder.append(", nazwa_miejscowosci=");
		builder.append(nazwa_miejscowosci);
		builder.append(", wojewodztwo=");
		builder.append(wojewodztwo);
		builder.append("]");
		return builder.toString();
	}

 

  
	
	
}
