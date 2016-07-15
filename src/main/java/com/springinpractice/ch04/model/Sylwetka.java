package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sylwetka {

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
}
