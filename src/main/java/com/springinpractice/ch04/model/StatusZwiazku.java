package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StatusZwiazku {

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

}
