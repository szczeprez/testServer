package com.springinpractice.ch04.service.impl;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springinpractice.ch04.dao.DanePodstawoweDao;
import com.springinpractice.ch04.model.DanePodstawowe;
import com.springinpractice.ch04.service.DanePodstawoweService;

@Service
@Transactional
public class DanePodstawoweServiceImpl implements DanePodstawoweService {
	private static final Logger LOGGER = LoggerFactory.getLogger(DanePodstawoweServiceImpl.class); 
	@Inject private DanePodstawoweDao danePodstawoweDao;
	
	@Override
	public DanePodstawowe findByName(String name) {
		LOGGER.info("DanePodstawoweServiceImpl findByName INPUT {}");
 
		 DanePodstawowe dp = danePodstawoweDao.findByName(name); 
		 if(dp == null){
			 System.out.println("findByName returned NULL !!");
		 }
		 return dp; 
	}

	@Override
	public void create(DanePodstawowe t) {
		LOGGER.info("DanePodstawoweServiceImpl create {}", t);
		danePodstawoweDao.create(t);
		
	}
	
	

}
