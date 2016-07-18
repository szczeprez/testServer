package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "findMieszkamById", query = "from Mieszkam where id = :id" )  
public class Mieszkam implements Serializable{

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((danePodstawowe == null) ? 0 : danePodstawowe.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((statusMieszkaniowy == null) ? 0 : statusMieszkaniowy.hashCode());
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
		Mieszkam other = (Mieszkam) obj;
		if (danePodstawowe == null) {
			if (other.danePodstawowe != null)
				return false;
		} else if (!danePodstawowe.equals(other.danePodstawowe))
			return false;
		if (id != other.id)
			return false;
		if (statusMieszkaniowy == null) {
			if (other.statusMieszkaniowy != null)
				return false;
		} else if (!statusMieszkaniowy.equals(other.statusMieszkaniowy))
			return false;
		return true;
	}
 
}
