package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mieszkam {

	@Id
	@GeneratedValue
	private long id;
	String statusMieszkaniowy; 

	@OneToOne(mappedBy = "mieszkam")
	DanePodstawowe danePodstawowe;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DanePodstawowe getDanePodstawowe() {
		return danePodstawowe;
	}

	public void setDanePodstawowe(DanePodstawowe danePodstawowe) {
		this.danePodstawowe = danePodstawowe;
	}

	public String getStatusMieszkaniowy() {
		return statusMieszkaniowy;
	}

	public void setStatusMieszkaniowy(String statusMieszkaniowy) {
		this.statusMieszkaniowy = statusMieszkaniowy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mieszkam [id=");
		builder.append(id);
		builder.append(", statusMieszkaniowy=");
		builder.append(statusMieszkaniowy);
		builder.append(", danePodstawowe=");
		builder.append(danePodstawowe);
		builder.append("]");
		return builder.toString();
	}

 
 
}
