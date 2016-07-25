package com.springinpractice.ch04.service;

import java.util.List;

import com.springinpractice.ch04.model.Plec;

public interface PlecService {

	public void create(Plec p);

	public Plec getPlec();

	public List<Plec> getAllPlec(); 
}
