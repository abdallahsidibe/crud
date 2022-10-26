package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.model.Telephone;
import com.crud.api.repository.TelephoneRepository;



// @Service : considers the class to be a class that contains business code
@Service
public class TelephoneServiceImpl implements TelephoneService {
	
	 @Autowired
	 TelephoneRepository telephoneRepository;

	@Override
	public Telephone create(Telephone telephone) {
		return telephoneRepository.save(telephone);
	}

	@Override
	public List<Telephone> read() {
		return telephoneRepository.findAll();
	}

	@Override
	public Telephone update(Telephone telephone) {
		return telephoneRepository.findById(telephone.getId())
				.map(t -> {
					t.setPrix(telephone.getPrix());
					t.setNom(telephone.getNom());
					t.setDescription(telephone.getDescription());
					return telephoneRepository.save(t);
				}).orElseThrow(() -> new RuntimeException("Telephone not found !"));
	}

	@Override
	public String delete(Long id) {
		telephoneRepository.deleteById(id);
		return "telephone deleted !";
	}


}
