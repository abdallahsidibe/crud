package com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.model.Telephone;

public interface TelephoneRepository extends JpaRepository<Telephone, Long>{

}
