package com.springinpractice.ch04.dao.hbn;

import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.ProvinceDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.domain.Province;

@Repository
public class HbnProvinceDao extends AbstractHbnDao<Province> implements ProvinceDao {
	private static final Logger log = LoggerFactory.getLogger(HbnProvinceDao.class);

	@Override
	public String findProvinceById(int id) {
		log.info("findProvinceById [HbnProvinceDao] id =" + id);
		return (String) getSession().getNamedQuery("findProvinceById").setParameter("id", id).uniqueResult();
	}

	@Override
	public Province findByName() {
		log.info("findByName [HbnProvinceDao] nazwa =");
		return (Province) getSession().getNamedQuery("from").uniqueResult();
	}

	@Override
	public Iterable<Province> findByName(String name) {
		return null;
	}

	@Override
	public Iterable<Province> findAllProvince() {
		log.info("findAllProvince[HbnProvinceDao]");
		Query query = getSession().createQuery("from Province");
		Iterable<Province> provinceList = query.list();
		log.info("findAllProvince[HbnProvinceDao][out] " + provinceList);
		return provinceList;
	}

}
