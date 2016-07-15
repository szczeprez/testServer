package com.springinpractice.ch04.service.impl;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springinpractice.ch04.dao.PlecDao;
import com.springinpractice.ch04.model.Plec;
import com.springinpractice.ch04.service.PlecService;

@Service
@Transactional
public class PlecServiceImpl implements PlecService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PlecServiceImpl.class); 
	@Inject private PlecDao plecDao; 
	
	
	@Override
	public void create(Plec p) {
		LOGGER.info("PlecServiceImpl createMethod [IN]", p);

		plecDao.create(p);
	}

}
