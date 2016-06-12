package com.springinpractice.ch04.dao;

import com.springinpractice.ch04.domain.Province;

public interface ProvinceDao {

	String findProvinceById(int id); 
	
	public Iterable<Province> findByName(String name); 
	
	Iterable<Province> findAllProvince(); 
}
