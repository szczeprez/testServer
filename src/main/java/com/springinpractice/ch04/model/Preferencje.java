package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Preferencje implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id; 
	
	private int wiekOd; 
	
	private int wiekDo; 
	
	@OneToOne
	private InteresujeMnie interesujeMnie; 
	
	@OneToOne
	private Plec plec;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWiekOd() {
		return wiekOd;
	}

	public void setWiekOd(int wiekOd) {
		this.wiekOd = wiekOd;
	}

	public int getWiekDo() {
		return wiekDo;
	}

	public void setWiekDo(int wiekDo) {
		this.wiekDo = wiekDo;
	}

	public InteresujeMnie getInteresujeMnie() {
		return interesujeMnie;
	}

	public void setInteresujeMnie(InteresujeMnie interesujeMnie) {
		this.interesujeMnie = interesujeMnie;
	}

	public Plec getPlec() {
		return plec;
	}

	public void setPlec(Plec plec) {
		this.plec = plec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Preferencje [id=");
		builder.append(id);
		builder.append(", wiekOd=");
		builder.append(wiekOd);
		builder.append(", wiekDo=");
		builder.append(wiekDo);
		builder.append(", interesujeMnie=");
		builder.append(interesujeMnie);
		builder.append(", plec=");
		builder.append(plec);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((interesujeMnie == null) ? 0 : interesujeMnie.hashCode());
		result = prime * result + ((plec == null) ? 0 : plec.hashCode());
		result = prime * result + wiekDo;
		result = prime * result + wiekOd;
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
		Preferencje other = (Preferencje) obj;
		if (id != other.id)
			return false;
		if (interesujeMnie == null) {
			if (other.interesujeMnie != null)
				return false;
		} else if (!interesujeMnie.equals(other.interesujeMnie))
			return false;
		if (plec == null) {
			if (other.plec != null)
				return false;
		} else if (!plec.equals(other.plec))
			return false;
		if (wiekDo != other.wiekDo)
			return false;
		if (wiekOd != other.wiekOd)
			return false;
		return true;
	}

}
