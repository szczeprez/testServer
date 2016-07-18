package com.springinpractice.ch04.dao;

import com.springinpractice.ch04.model.DanePodstawowe;

public interface DanePodstawoweDao {

	DanePodstawowe findByName(String name); 
	
	public void create(DanePodstawowe t); 
}
