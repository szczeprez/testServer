package com.springinpractice.ch04.dao.hbn;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.PreferencjeDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.model.Preferencje;

@Repository
public class HbnPreferencjeDao extends AbstractHbnDao<Preferencje> implements PreferencjeDao {

	
	@Override
	public List<Preferencje> getAll() {
		getSession().beginTransaction(); 
		List list = getSession().createQuery("from Preferencje").list();
		
		return list; 
	}
}
