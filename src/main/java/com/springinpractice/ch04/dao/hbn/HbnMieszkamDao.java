package com.springinpractice.ch04.dao.hbn;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.MieszkamDao;
import com.springinpractice.ch04.dao.hibernate.AbstractHbnDao;
import com.springinpractice.ch04.model.Mieszkam;

@Repository
public class HbnMieszkamDao extends AbstractHbnDao<Mieszkam> implements MieszkamDao {

}
