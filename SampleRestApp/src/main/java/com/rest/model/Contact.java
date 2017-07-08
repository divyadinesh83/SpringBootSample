package com.rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue
	private long id;
	 
	 @Column(nullable = false) 
	private String name;
	 
	 @Column(nullable = false)
	private String address;
	 
	 @Column(nullable = false) 
	private String phoneno;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	public Contact(long id,String name,String address,String phoneno) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
		this.phoneno=phoneno;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
