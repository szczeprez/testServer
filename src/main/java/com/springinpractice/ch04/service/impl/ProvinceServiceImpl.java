package com.springinpractice.ch04.service.impl;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springinpractice.ch04.dao.ProvinceDao;
import com.springinpractice.ch04.domain.Province;
import com.springinpractice.ch04.service.ProvinceService;

@Service
@Transactional(readOnly = false)	
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired ProvinceDao provinceDao; 
	
	private static final Logger log = LoggerFactory.getLogger(ProvinceServiceImpl.class); 
	@Override
	public Province getProvinceByName(String nazwa) throws Exception {
		Province province = (Province) provinceDao.findByName(nazwa); 
		if(province == null)
	         throw new NullPointerException("Object province jest pusty"); 
		else if(province.getName().isEmpty())
			 throw new Exception("nazwa jest pusta"); 
		
		return province;
	}
	@Override
	public Iterable<Province> findAllProvince() {
		log.info("[ProvinceServiceImpl][findAllProvince][in]");
		Iterable<Province> provinceList = provinceDao.findAllProvince(); 
		log.info("[ProvinceServiceImpl][findAllProvince][out]" + provinceList);
		return provinceList;
	}

}
