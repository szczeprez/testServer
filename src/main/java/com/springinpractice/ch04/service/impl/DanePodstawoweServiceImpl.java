package com.springinpractice.ch04.service.impl;

import java.util.List;

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

	@Override
	public List<DanePodstawowe> getAll() {
		
		LOGGER.info("DanePodstawoweServiceImpl getAll() {}");
		List<DanePodstawowe> all = danePodstawoweDao.getAll(); 
		if(all == null){  
			System.err.println("getAll is null!! in DanePodstawoweServiceImpl !");
			} 
		
		return all;
	}

	@Override
	public DanePodstawowe getDanePodstawoweById(Long id) {
		danePodstawoweDao.get(id); 
		return danePodstawoweDao.get(id);
	}

	@Override
	public boolean addDanePodstawowe(DanePodstawowe danePodstawowe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateDanePodstawowe(DanePodstawowe danePodstawowe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDanePodstawowe(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
