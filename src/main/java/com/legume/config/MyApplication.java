package com.legume.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.legume.bo.IServiceLegume;
import com.legume.model.Legume;

@Component
public class MyApplication {

	final static Logger logger = Logger.getLogger(MyApplication.class);

	@Autowired
	private IServiceLegume iLegume;
	
	public void addLegume()
	{
		Legume legume = new Legume("carotte");

		// Save new employee
		iLegume.addNewLegume(legume);
		Legume leg=iLegume.getLegume(1);
		if(leg!=null && leg.getName()!=null){
			logger.debug("legume : "+ leg.getName());
		}else{
			logger.debug("pb insert ");
		}
		

	}



}
