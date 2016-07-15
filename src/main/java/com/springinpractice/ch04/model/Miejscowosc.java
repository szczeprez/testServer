package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Miejscowosc {

	@Id
	@GeneratedValue
	private long id; 
	private String nazwa_miejscowosci; 
	
	@ManyToOne
	@JoinColumn(name = "woj_id")
	private Wojewodztwo wojewodztwo;
	
	@OneToOne(mappedBy = "miejscowosc")
	DanePodstawowe danePodstawowe; 

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
