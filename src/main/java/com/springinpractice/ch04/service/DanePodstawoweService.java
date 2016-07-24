package com.springinpractice.ch04.service;

import java.util.List;

import com.springinpractice.ch04.model.DanePodstawowe;

public interface DanePodstawoweService {

	DanePodstawowe findByName(String name);
	
	public void create(DanePodstawowe t); 
	
	
	public List<DanePodstawowe> getAll() ;

	DanePodstawowe getDanePodstawoweById(Long id);

	boolean addDanePodstawowe(DanePodstawowe danePodstawowe);

	void updateDanePodstawowe(DanePodstawowe danePodstawowe);

	void deleteDanePodstawowe(Long id); 
	
}
