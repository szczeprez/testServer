package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DodatkowaInformacja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;

	@Id
	@GeneratedValue
	private long id;
	
	private String dodatkowaInfo;
	
	//@OneToOne(mappedBy = "dodatkowaInformacja")
	//DanePodstawowe danePodstawowe; 

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

	
/*	public DanePodstawowe getDanePodstawowe() {
		return danePodstawowe;
	}

	public void setDanePodstawowe(DanePodstawowe danePodstawowe) {
		this.danePodstawowe = danePodstawowe;
	}*/

 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dodatkowaInfo == null) ? 0 : dodatkowaInfo.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "DodatkowaInformacja [id=" + id + ", dodatkowaInfo=" + dodatkowaInfo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DodatkowaInformacja other = (DodatkowaInformacja) obj;
		if (dodatkowaInfo == null) {
			if (other.dodatkowaInfo != null)
				return false;
		} else if (!dodatkowaInfo.equals(other.dodatkowaInfo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



}
