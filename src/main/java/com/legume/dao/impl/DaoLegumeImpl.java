package com.legume.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.legume.dao.IDaoLegume;
import com.legume.model.Legume;

@Repository("legumeDao")
public class DaoLegumeImpl implements IDaoLegume{

	@Autowired
	private SessionFactory sessionFactory;
	
		public void save(Legume legume){
			sessionFactory.getCurrentSession().save(legume);
		}

		public void update(Legume legume){
			sessionFactory.getCurrentSession().update(legume);
		}

		public void delete(Legume legume){
			sessionFactory.getCurrentSession().delete(legume);
		}

		public Legume findByLegumeById(Integer id){
			return sessionFactory.getCurrentSession().get(Legume.class,id);
		}
}
