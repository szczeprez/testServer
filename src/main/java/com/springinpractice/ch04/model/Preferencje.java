package com.springinpractice.ch04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Preferencje {

	@Id
	@GeneratedValue
	private long id; 
	
	private int wiekOd; 
	
	private int wiekDo; 
	
	@OneToOne
	private InteresujeMnie interesujeMnie; 
	
	@OneToOne
	DanePodstawowe danePodstawowe;
	
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

	public DanePodstawowe getDanePodstawowe() {
		return danePodstawowe;
	}

	public void setDanePodstawowe(DanePodstawowe danePodstawowe) {
		this.danePodstawowe = danePodstawowe;
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
		builder.append(", danePodstawowe=");
		builder.append(danePodstawowe);
		builder.append(", plec=");
		builder.append(plec);
		builder.append("]");
		return builder.toString();
	} 
	
	
}
