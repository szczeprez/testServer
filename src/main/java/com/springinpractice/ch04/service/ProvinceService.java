package com.springinpractice.ch04.service;

import com.springinpractice.ch04.domain.Province;

public interface ProvinceService {

	Province getProvinceByName(String nazwa) throws Exception; 
	
	public Iterable<Province> findAllProvince() ;
}
