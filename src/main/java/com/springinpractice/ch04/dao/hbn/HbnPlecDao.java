package com.springinpractice.ch04.dao.hbn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.PlecDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.model.Plec;

@Repository
public class HbnPlecDao extends AbstractHbnDao<Plec> implements PlecDao{

	private static final Logger LOGGER = LoggerFactory.getLogger(HbnPlecDao.class); 
	@Override
	public void create(Plec p) {
		LOGGER.info("HbnPlecDao create {}", p);
		getSession().beginTransaction(); 

		getSession().persist(p);
		getSession().getTransaction().commit();
		LOGGER.info("HbnPlecDao create {} [OUT]");
	}

}
