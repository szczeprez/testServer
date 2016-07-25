package com.springinpractice.ch04.dao;

import java.util.List;

import com.springinpractice.ch04.model.Plec;

public interface PlecDao {
	
	public void create(Plec p); 
	
	public Plec getPlec();
	
	public List<Plec> getAllPlec(); 

}
