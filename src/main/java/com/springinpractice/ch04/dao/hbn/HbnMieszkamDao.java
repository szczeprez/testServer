package com.springinpractice.ch04.dao.hbn;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.MieszkamDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.model.Mieszkam;

@Repository
public class HbnMieszkamDao extends AbstractHbnDao<Mieszkam> implements MieszkamDao {

	@Override
	public Mieszkam get(Serializable id) {
        getSession().beginTransaction(); 
		Query q = getSession().getNamedQuery("findMieszkamById"); 
		q.setParameter("id", id); 
		System.out.println(q.uniqueResult() + " ddddddddddddd");
		return (Mieszkam) q.uniqueResult();
	}
	
	@Override
	public List<Mieszkam> getAll() {
		getSession().beginTransaction(); 
		Query q =  getSession().createQuery("From Mieszkam m where m.id = 1"); 
		return q.list();
	}
}
