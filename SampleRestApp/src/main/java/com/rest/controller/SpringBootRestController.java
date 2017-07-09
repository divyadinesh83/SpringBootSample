package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Contact;
import com.rest.repository.ContactRepo;

@RestController
@RequestMapping("/")
public class SpringBootRestController {
	
	
	@Autowired
	ContactRepo contactRepo;
	
	 @RequestMapping(value = "/contact", method = RequestMethod.POST)
	    public Contact addContact(@RequestBody Contact contact) {	      
	        return contactRepo.save(contact);
		 
	    }

}
