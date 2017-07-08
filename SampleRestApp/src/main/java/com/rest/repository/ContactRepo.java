package com.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rest.model.Contact;


public interface ContactRepo extends CrudRepository<Contact, Long>{

	/*public void addContact(Contact contact);
	public void deleteContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactByName(String name);*/
	
	
}
