/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.dao.hbn;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.RoleDao;
import com.springinpractice.ch04.domain.Role;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository
public class HbnRoleDao extends AbstractHbnDao<Role> implements RoleDao {

	public Role findByName(String name) {
		Query q = getSession().getNamedQuery("findRoleByName");
		q.setParameter("name", name);
		return (Role) q.uniqueResult();
	}
 
}
