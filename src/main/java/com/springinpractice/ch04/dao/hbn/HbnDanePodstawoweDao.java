package com.springinpractice.ch04.dao.hbn;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.DanePodstawoweDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.model.DanePodstawowe;

@Repository
public class HbnDanePodstawoweDao extends AbstractHbnDao<DanePodstawowe> implements DanePodstawoweDao {
 

	@Override
	public DanePodstawowe findByName(String name) {
		getSession().beginTransaction();
		org.hibernate.Query q = getSession().getNamedQuery("findDanePodstawoweByName"); 
		q.setParameter("name", name); 
		
		return (DanePodstawowe) q.uniqueResult();
		
	}
	
	@Override
	@Transactional
	public void create(DanePodstawowe t) {
		super.create(t);
		getSession().beginTransaction(); 

		getSession().persist(t);
		getSession().getTransaction().commit();
		
		System.out.println("Dane podstawowe Created !!!");
	}

 
	
}
