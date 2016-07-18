package com.springinpractice.ch04.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springinpractice.ch04.dao.hbn.HbnMieszkamDao;
import com.springinpractice.ch04.model.Mieszkam;
import com.springinpractice.ch04.service.MieszkamService;

@Service
@Transactional
public class MieszkamServiceImpl implements MieszkamService {

	@Inject HbnMieszkamDao hbnMieszkamDao; 
	
	@Override
	public Mieszkam get(Long id) {
		return hbnMieszkamDao.get(id); 
	}

	@Override
	public List<Mieszkam> getAll() {
		List<Mieszkam> mieszams = hbnMieszkamDao.getAll();
		return mieszams;
	}

}
