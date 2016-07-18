package com.springinpractice.ch04.service;

import com.springinpractice.ch04.model.DanePodstawowe;

public interface DanePodstawoweService {

	DanePodstawowe findByName(String name);
	
	public void create(DanePodstawowe t); 
	
}
