package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DodatkowaInformacja {

	@Id
	@GeneratedValue
	private long id;
	
	private String dodatkowaInfo;
	
	@OneToOne(mappedBy = "dodatkowaInformacja")
	DanePodstawowe danePodstawowe; 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDodatkowaInfo() {
		return dodatkowaInfo;
	}

	public void setDodatkowaInfo(String dodatkowaInfo) {
		this.dodatkowaInfo = dodatkowaInfo;
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
		builder.append("DodatkowaInformacja [id=");
		builder.append(id);
		builder.append(", dodatkowaInfo=");
		builder.append(dodatkowaInfo);
		builder.append("]");
		return builder.toString();
	}

}
