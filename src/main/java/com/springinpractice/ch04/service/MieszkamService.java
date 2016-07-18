package com.springinpractice.ch04.service;

import java.util.List;

import com.springinpractice.ch04.model.Mieszkam;

public interface MieszkamService {

	Mieszkam get(Long id); 
	
	List<Mieszkam> getAll(); 
 
}
