package com.springinpractice.ch04.dao;

import java.io.Serializable;
import java.util.List;

import com.springinpractice.ch04.model.DanePodstawowe;

public interface DanePodstawoweDao {

	DanePodstawowe findByName(String name); 
	
	public void create(DanePodstawowe t); 
	
	public List<DanePodstawowe> getAll(); 
	
	public DanePodstawowe get(Serializable id);
	
	public boolean addDanePodstawowe(DanePodstawowe danePodstawowe);

	public void updateDanePodstawowe(DanePodstawowe danePodstawowe);

	public void deleteDanePodstawowe(Long id) ;

}
