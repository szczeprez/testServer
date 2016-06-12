package com.springinpractice.ch04.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Places")
public class Places {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int places_id; 
	
	@ManyToOne // miasta należą do woj.
	Province woj_id; 
	
	@NotEmpty
	String nazwa_woj;

	public Places() {}	
	
	public Places(int id, Province woj_id, String nazwa_woj) {
		super();
		this.places_id = id;
		this.woj_id = woj_id;
		this.nazwa_woj = nazwa_woj;
	}

	public int getId() {
		return places_id;
	}

	public void setId(int id) {
		this.places_id = id;
	}


	public Province getWoj_id() {
		return woj_id;
	}

	public void setWoj_id(Province woj_id) {
		this.woj_id = woj_id;
	}

	public String getNazwa_woj() {
		return nazwa_woj;
	}

	public void setNazwa_woj(String nazwa_woj) {
		this.nazwa_woj = nazwa_woj;
	}

	@Override
	public String toString() {
		return "Places [id=" + places_id + ", woj_id=" + woj_id + ", nazwa_woj=" + nazwa_woj + "]";
	} 
	
	
	
}
