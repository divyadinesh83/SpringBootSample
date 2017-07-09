package com.rest.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.model.Contact;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringBootRestTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testCreateContact() {

		String requestUrl="http://localhost:8080/contact";

		Contact contact = new Contact();
		contact.setName("DineshK");
		contact.setAddress("Chennai");
		contact.setPhoneno("9444444");

		TestRestTemplate rest = new TestRestTemplate();

		ResponseEntity<Contact> response = 
				rest.postForEntity(requestUrl, contact, Contact.class);

		assertThat( response.getStatusCode() , equalTo(HttpStatus.OK));

		Contact contactCreated = response.getBody();
		assertThat( contactCreated.getName() , equalTo("DineshK") );
		assertThat( contactCreated.getAddress() , equalTo("Chennai") );
		assertThat( contactCreated.getPhoneno() , equalTo("9444444") );

	}

}
