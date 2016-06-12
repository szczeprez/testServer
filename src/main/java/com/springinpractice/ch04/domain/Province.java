package com.springinpractice.ch04.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Province")
public class Province {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int province_id;
    
    @NotEmpty
	String name;
    
    @OneToMany
    private Set<Places> places = new HashSet<Places>(0); 

	public Province() {
	}

	public Province(int province_id, String name, Set<Places> places) {
		super();
		this.province_id = province_id;
		this.name = name;
		this.places = places;
	}

	public int getId() {
		return province_id;
	}

	public void setId(int id) {
		this.province_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Places> getPlaces() {
		return places;
	}

	public void setPlaces(Set<Places> places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "Province [id=" + province_id + ", name=" + name + ", places=" + places + "]";
	}

	

}
