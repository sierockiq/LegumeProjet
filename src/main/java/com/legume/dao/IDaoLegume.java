package com.legume.dao;

import com.legume.model.Legume;

public interface IDaoLegume {

	void save(Legume Legume);
	void update(Legume Legume);
	void delete(Legume Legume);
	Legume findByLegumeById(Integer id);

}
