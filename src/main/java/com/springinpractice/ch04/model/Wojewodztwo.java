package com.springinpractice.ch04.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Wojewodztwo {

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
	
}
