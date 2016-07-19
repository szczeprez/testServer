package com.springinpractice.ch04.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springinpractice.ch04.dao.PreferencjeDao;
import com.springinpractice.ch04.model.Preferencje;
import com.springinpractice.ch04.service.PreferencjeService;

@Service
@Transactional
public class PreferencjeServiceImpl implements PreferencjeService{

	@Inject PreferencjeDao preferencjeDao; 
	
	@Override
	public List<Preferencje> getAll() {
		 
		return preferencjeDao.getAll();
	}

}
