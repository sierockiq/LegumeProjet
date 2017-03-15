package com.legume.bo;

import com.legume.model.Legume;

public interface IServiceLegume {

	Legume getLegume(Integer id);
	void addNewLegume(Legume legume);

}
