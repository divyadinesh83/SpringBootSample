package com.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.model.Contact;


public interface ContactRepo extends CrudRepository<Contact, Long>{


	
}
