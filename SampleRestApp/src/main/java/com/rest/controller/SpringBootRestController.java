package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Contact;
import com.rest.repository.ContactRepo;

@RestController
public class SpringBootRestController {
	
	
	@Autowired
	ContactRepo contactRepo;
	
	 @RequestMapping("/addcontact")
	    void addContact(String name, String address, String phoneno) {
	        Contact contact=new Contact();
	        contact.setName(name);
	        contact.setAddress(address);
	        contact.setPhoneno(phoneno);
	        contactRepo.save(contact);
		 
	    }

}
