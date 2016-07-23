package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@NamedQuery(name = "findMieszkamById", query = "from Mieszkam where id = :id")
public class Mieszkam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String statusMieszkaniowy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatusMieszkaniowy() {
		return statusMieszkaniowy;
	}

	public void setStatusMieszkaniowy(String statusMieszkaniowy) {
		this.statusMieszkaniowy = statusMieszkaniowy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (id != other.id)
			return false;
		if (statusMieszkaniowy == null) {
			if (other.statusMieszkaniowy != null)
				return false;
		} else if (!statusMieszkaniowy.equals(other.statusMieszkaniowy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mieszkam [id=");
		builder.append(id);
		builder.append(", statusMieszkaniowy=");
		builder.append(statusMieszkaniowy);
		builder.append("]");
		return builder.toString();
	}

}
