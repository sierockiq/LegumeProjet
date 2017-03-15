package com.legume.bo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.legume.dao.IDaoLegume;
import com.legume.model.Legume;

@Service
@Transactional(readOnly = true)
public class ServiceLegume implements IServiceLegume{
		final static  Logger logger = Logger.getLogger(ServiceLegume.class);

		@Autowired
		IDaoLegume legumeDao;

		public Legume getLegume(Integer id) {
			logger.debug("Getting legume with id " + id);
			return legumeDao.findByLegumeById(id);
		}
		@Override
		@Transactional(readOnly = false)
		public void addNewLegume(Legume legume) {
			legumeDao.save(legume);
		}



}
