package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.model.Telephone;
import com.crud.api.service.TelephoneService;

// @RestController : allows the class to be considered as a controller. The class can expose a resource
@RestController

@RequestMapping("/telephone")
public class TelephoneController {
	
	@Autowired
	TelephoneService telephoneService;

	@PostMapping("/create")
	public Telephone create(@RequestBody Telephone telephone) {
		return telephoneService.create(telephone);
	}

	@GetMapping("/read")
	public List<Telephone> read() {
		return telephoneService.read();
	}

	@PutMapping("/update")
	public Telephone update( @RequestBody Telephone telephone) {
		return telephoneService.update(telephone);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return telephoneService.delete(id);
	}

}
