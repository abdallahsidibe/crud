package com.crud.api.service;

import java.util.List;

import com.crud.api.model.Telephone;

public interface TelephoneService {
	
	Telephone create(Telephone telephone);
	
	List<Telephone> read();
	
	Telephone update( Telephone telephone);
	
	String delete(Long id);

}
